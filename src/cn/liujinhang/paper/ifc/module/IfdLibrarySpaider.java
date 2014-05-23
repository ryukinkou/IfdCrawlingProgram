package cn.liujinhang.paper.ifc.module;

import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import no.catenda.peregrine.model.objects.json.IfdAPISession;
import no.catenda.peregrine.model.objects.json.IfdConcept;
import cn.liujinhang.paper.ifc.module.thread.IdfConceptCrawlingThread;
import cn.liujinhang.paper.ifc.system.Constant;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hp.hpl.jena.ontology.OntClass;

public class IfdLibrarySpaider {

	private Map<String, OntClass> ontologyClasses;

	private Map<String, Future<List<IfdConcept>>> result;

	private ExecutorService threadPool;

	public IfdLibrarySpaider(Map<String, OntClass> ontologyClasses) {

		this.result = new HashMap<String, Future<List<IfdConcept>>>();
		this.ontologyClasses = ontologyClasses;
		threadPool = Executors.newFixedThreadPool(10);

	}

	private IfdAPISession login() throws Exception {

		URL url = new URL(Constant.BSDD_BASE_URL + "/session/login");
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);

		URLConnection connection = url.openConnection();

		connection.setRequestProperty("accept", "application/json");
		connection.setDoOutput(true);

		OutputStreamWriter writer = new OutputStreamWriter(
				connection.getOutputStream());
		writer.write("email=" + Constant.BSDD_LOGIN_EMAIL + "&password="
				+ Constant.BSDD_LOGIN_PASSWORD);
		writer.flush();
		writer.close();

		IfdAPISession session = (IfdAPISession) mapper.readValue(
				connection.getInputStream(), IfdAPISession.class);

		return session;

	}

	@SuppressWarnings("unchecked")
	public void crawlingIfdConceptOfOntologyClass() {

		try {

			this.login();

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (String uri : this.ontologyClasses.keySet()) {
			String keyword = uri.substring(uri.indexOf("#") + 1);
			IdfConceptCrawlingThread thread = new IdfConceptCrawlingThread();
			thread.setKeyword(keyword);
			Future<List<IfdConcept>> future = threadPool.submit(thread);
			this.result.put(keyword, future);
		}

		for (String keyword : this.result.keySet()) {

			try {
				Future<List<IfdConcept>> future = this.result.get(keyword);
				List<IfdConcept> concepts = future.get();

				if (concepts != null) {
					System.out.println("----------");
					System.out.println(keyword + " | " + concepts.size());
					for (IfdConcept concept : concepts) {
						System.out.println(keyword + " | " + concept.getGuid());
					}
					System.out.println("----------");
				} else {
					System.out.println("----------");
					System.out.println(keyword + " | nothing");
					System.out.println("----------");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
