package cn.liujinhang.paper.ifc;

public class Crawling {

	public static void main(String[] args) {

		IfdSpaider spaider = new IfdSpaider();
		//spaider.crawling();

		IfcOntologyReader reader = new IfcOntologyReader();
		reader.read();
		
	}

}
