package cn.liujinhang.paper.ifc.module;

import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
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

	private List<Future<IfdConcept>> result;

	private ExecutorService threadPool;

	public IfdLibrarySpaider(Map<String, OntClass> ontologyClasses) {

		this.result = new ArrayList<Future<IfdConcept>>();
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

	public void crawlingIfdConceptOfOntologyClass() {

		try {
			
			this.login();
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		for (String uri : this.ontologyClasses.keySet()) {
			String keyword = uri.substring(uri.indexOf("#") + 1);
			IdfConceptCrawlingThread thread = new IdfConceptCrawlingThread();
			thread.setKeyword(keyword);
			Future<IfdConcept> future = threadPool.submit(thread);
			this.result.add(future);
		}
		
		for (Future<IfdConcept> future : this.result) {
		
			
		}

	}

}
