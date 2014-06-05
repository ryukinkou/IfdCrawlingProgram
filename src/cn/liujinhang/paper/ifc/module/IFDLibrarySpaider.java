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

import no.catenda.peregrine.model.objects.json.IfdConcept;
import cn.liujinhang.paper.ifc.module.thread.IFDConceptCrawlingThread;
import cn.liujinhang.paper.ifc.system.Constant;

import com.hp.hpl.jena.ontology.OntClass;

public class IFDLibrarySpaider {

	private ExecutorService threadPool;

	private Map<String, OntClass> classMap;

	public IFDLibrarySpaider(Map<String, OntClass> classMap) {

		this.classMap = classMap;

		threadPool = Executors.newFixedThreadPool(1);
	}

	private void login() throws Exception {

		URL url = new URL(Constant.BSDD_BASE_URL + "/session/login");

		URLConnection connection = url.openConnection();

		connection.setRequestProperty("accept", "application/json");
		connection.setDoOutput(true);

		OutputStreamWriter writer = new OutputStreamWriter(
				connection.getOutputStream());
		writer.write("email=" + Constant.BSDD_LOGIN_EMAIL + "&password="
				+ Constant.BSDD_LOGIN_PASSWORD);
		writer.flush();
		writer.close();

		connection.connect();

		System.out.println("login");

	}

	@SuppressWarnings("unused")
	private void logout() throws Exception {

		URL url = new URL(Constant.BSDD_BASE_URL + "/session/logout");

		URLConnection connection = url.openConnection();
		connection.setDoOutput(false);

		connection.connect();

	}

	@SuppressWarnings("unchecked")
	public Map<OntClass, Future<List<IfdConcept>>> launch() {

		Map<OntClass, Future<List<IfdConcept>>> conceptResult = null;

		try {

			conceptResult = new HashMap<OntClass, Future<List<IfdConcept>>>();

			this.login();

			for (String uri : classMap.keySet()) {
				String keyword = uri.substring(uri.indexOf("#") + 1);
				IFDConceptCrawlingThread thread = new IFDConceptCrawlingThread();
				thread.setKeyword(keyword);
				Future<List<IfdConcept>> future = threadPool.submit(thread);
				conceptResult.put(classMap.get(uri), future);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.threadPool.shutdown();
		}

		return conceptResult;

	}
}
