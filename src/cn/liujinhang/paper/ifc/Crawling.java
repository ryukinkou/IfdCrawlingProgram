package cn.liujinhang.paper.ifc;

import cn.liujinhang.paper.ifc.module.IfcOntologyReader;
import cn.liujinhang.paper.ifc.module.IfdLibrarySpaider;

public class Crawling {

	public static void main(String[] args) {

		IfcOntologyReader reader = new IfcOntologyReader();
		reader.read();
		
		IfdLibrarySpaider spaider = new IfdLibrarySpaider(reader.getOntologyClasses());
		spaider.crawlingIfdConceptOfOntologyClass();
		
	}

}
