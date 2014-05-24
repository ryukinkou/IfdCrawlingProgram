package cn.liujinhang.paper.ifc;

import cn.liujinhang.paper.ifc.module.IFCOntologyReader;
import cn.liujinhang.paper.ifc.module.IFDConceptAnalyzer;
import cn.liujinhang.paper.ifc.module.IFDLibrarySpaider;

public class LetsDoThis {

	public static void main(String[] args) {

		IFCOntologyReader reader = new IFCOntologyReader();
		reader.read();

		IFDLibrarySpaider spaider = new IFDLibrarySpaider();
		spaider.crawl();

		IFDConceptAnalyzer analyzer = new IFDConceptAnalyzer();
		analyzer.launch();

	}

}
