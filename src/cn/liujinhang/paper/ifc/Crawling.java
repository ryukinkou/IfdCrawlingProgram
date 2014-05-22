package cn.liujinhang.paper.ifc;

import cn.liujinhang.paper.ifc.module.IfcOntologyReader;
import cn.liujinhang.paper.ifc.module.IfdLibrarySpaider;

public class Crawling {

	public static void main(String[] args) {

		IfdLibrarySpaider spaider = new IfdLibrarySpaider();
		spaider.crawling();

		IfcOntologyReader reader = new IfcOntologyReader();
		reader.read();
		
	}

}
