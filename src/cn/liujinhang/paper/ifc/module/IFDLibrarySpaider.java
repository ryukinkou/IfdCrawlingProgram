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
import cn.liujinhang.paper.ifc.bean.ResultKey;
import cn.liujinhang.paper.ifc.module.thread.IFDConceptCrawlingThread;
import cn.liujinhang.paper.ifc.system.Constant;
import cn.liujinhang.paper.ifc.system.GobalContext;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hp.hpl.jena.ontology.OntClass;

public class IFDLibrarySpaider {

	private ExecutorService threadPool;

	public IFDLibrarySpaider() {
		threadPool = Executors.newFixedThreadPool(50);
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
	public void crawl() {

		try {
			this.login();
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (String uri : GobalContext.IFCOntologyClasses.keySet()) {
			String keyword = uri.substring(uri.indexOf("#") + 1);
			IFDConceptCrawlingThread thread = new IFDConceptCrawlingThread();
			thread.setKeyword(keyword);
			Future<List<IfdConcept>> future = threadPool.submit(thread);
			GobalContext.IFDConceptResultMap.put(new ResultKey(keyword,
					false), future);
		}

	}
}
