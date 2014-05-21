package cn.liujinhang.paper.ifc;

import java.rmi.RemoteException;

import cn.liujinhang.paper.ifc.webservice.entity.IfdConcept;
import cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3;
import cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3Proxy;

public class Crawling {

	public static void main(String[] args) {

		Ifd_wsdl_express_v3 proxy = new Ifd_wsdl_express_v3Proxy();

		try {

			String sessionId = proxy.login("demo", "demo");

			System.out.println(sessionId);

			IfdConcept[] list = proxy.searchForConcepts(sessionId, "IfcDoor",
					null, null);

			for (IfdConcept concept : list) {
				System.out.println(concept.getFullNames()[0].getName());
			}

			IfdConcept[] list2 = proxy.searchForConcepts(sessionId, "IfcActor",
					null, null);

			for (IfdConcept concept : list2) {
				System.out.println(concept.getFullNames()[0].getName());
			}

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
