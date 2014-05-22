package cn.liujinhang.paper.ifc.module.thread;

import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

import no.catenda.peregrine.model.objects.json.IfdAPISession;
import no.catenda.peregrine.model.objects.json.IfdConcept;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IdfConceptCrawlingThread<V> implements Callable<V> {

	@Override
	public V call() throws Exception {

		this.login();
		
		this.query();

		return null;
	}

	public void login() throws Exception {

		String baseURL = "http://bsdd.catenda.com/api/4.0";

		URL url = new URL(baseURL + "/session/login");
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);

		URLConnection connection = url.openConnection();

		connection.setRequestProperty("accept", "application/json");
		connection.setDoOutput(true);

		OutputStreamWriter out = new OutputStreamWriter(
				connection.getOutputStream());
		out.write("email=ryukinkou@gmail.com&password=19891023");
		out.flush();
		out.close();

		IfdAPISession result = (IfdAPISession) mapper.readValue(
				connection.getInputStream(), IfdAPISession.class);

		System.out.println("login.");
		System.out.println(result.getGuid());
	}
	
	public void query() throws Exception {

		String baseURL = "http://bsdd.catenda.com/api/4.0";

		URL url = new URL(baseURL + "/IfdConcept/3vHRQ8oT0Hsm00051Mm008");
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);

		URLConnection connection = url.openConnection();

		connection.setRequestProperty("accept", "application/json");
		connection.setDoOutput(true);

		IfdConcept result = (IfdConcept) mapper.readValue(
				connection.getInputStream(), IfdConcept.class);

		System.out.println("query.");
		System.out.println(result.getFullNames().get(0).getName());
	}

}
