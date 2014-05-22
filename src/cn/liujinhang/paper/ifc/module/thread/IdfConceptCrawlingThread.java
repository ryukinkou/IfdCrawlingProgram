package cn.liujinhang.paper.ifc.module.thread;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

import no.catenda.peregrine.model.objects.json.IfdConcept;
import cn.liujinhang.paper.ifc.system.Constant;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("rawtypes")
public class IdfConceptCrawlingThread implements Callable {

	private String keyword;

	private String guid;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}
	
	

	@Override
	public IfdConcept call() throws Exception {

		return this.search(keyword);
	}

	private IfdConcept queryByGuid(String guid) throws Exception {

		URL url = new URL(Constant.BSDD_BASE_URL + "/IfdConcept/" + guid);

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);
		URLConnection connection = url.openConnection();

		connection.setRequestProperty("accept", "application/json");
		connection.setDoOutput(true);

		IfdConcept result = (IfdConcept) mapper.readValue(
				connection.getInputStream(), IfdConcept.class);

		return result;
	}

	private IfdConcept search(String keyword) throws Exception {

		URL url = new URL(Constant.BSDD_BASE_URL + "/IfdConcept/search/"
				+ keyword);

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);
		URLConnection connection = url.openConnection();

		connection.setRequestProperty("accept", "application/json");
		connection.setDoOutput(true);
		String sCurrentLine;  
        String sTotalString;  
        sCurrentLine = "";  
        sTotalString = "";  
        InputStream l_urlStream;  
        l_urlStream = connection.getInputStream();  
        BufferedReader l_reader = new BufferedReader(new InputStreamReader(  
                l_urlStream));  
        while ((sCurrentLine = l_reader.readLine()) != null) {  
            sTotalString += sCurrentLine + "\r\n";  
  
        }  
        System.out.println(sTotalString);
        
        String a = sTotalString.replace("{\"IfdConcept\":", "");
        
        String b = a.substring(0,a.length());
		
		IfdConcept result = (IfdConcept) mapper.readValue(
				b, IfdConcept.class);
		
		if(result.getGuid() != null){
			
			System.out.println(result.getGuid());
			
		}
		
		return result;
	}

}
