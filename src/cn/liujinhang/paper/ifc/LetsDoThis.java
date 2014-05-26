package cn.liujinhang.paper.ifc;

import cn.liujinhang.paper.ifc.module.IFCOntologyReader;
import cn.liujinhang.paper.ifc.module.IFCOntologyWriter;
import cn.liujinhang.paper.ifc.module.IFDLibrarySpaider;

public class LetsDoThis {

	public static void main(String[] args) {

		IFCOntologyReader reader = new IFCOntologyReader();
		reader.lanuch();

		IFDLibrarySpaider spaider = new IFDLibrarySpaider();
		spaider.lanuch();

		IFCOntologyWriter writer = new IFCOntologyWriter();
		writer.launch();

	}

}
