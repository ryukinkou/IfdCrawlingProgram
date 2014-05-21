package cn.liujinhang.paper.ifc.thread;

import java.rmi.RemoteException;
import java.util.concurrent.Callable;

import cn.liujinhang.paper.ifc.webservice.entity.IfdConcept;
import cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3;
import cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3Proxy;

public class IdfConceptCrawlingThread implements Callable<IfdConcept[]> {

	private String keyword;

	@Override
	public IfdConcept[] call() throws Exception {

		Ifd_wsdl_express_v3 proxy = new Ifd_wsdl_express_v3Proxy();
		IfdConcept[] concepts = null;

		try {

			String sessionId = proxy.login("demo", "demo");
			concepts = proxy.searchForConcepts(sessionId, this.keyword, null,
					null);

		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return concepts;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
