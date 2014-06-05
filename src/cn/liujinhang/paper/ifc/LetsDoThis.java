package cn.liujinhang.paper.ifc;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import no.catenda.peregrine.model.objects.json.IfdConcept;

import com.hp.hpl.jena.ontology.OntClass;

import cn.liujinhang.paper.ifc.module.IFCOntologyReader;
import cn.liujinhang.paper.ifc.module.IFCOntologyWriter;
import cn.liujinhang.paper.ifc.module.IFDLibrarySpaider;

public class LetsDoThis {

	public static void main(String[] args) {

		Map<String, OntClass> classMap = new IFCOntologyReader().launch();

		Map<OntClass, Future<List<IfdConcept>>> conceptResult = new IFDLibrarySpaider(
				classMap).launch();

		new IFCOntologyWriter(conceptResult).launch();

	}

}
