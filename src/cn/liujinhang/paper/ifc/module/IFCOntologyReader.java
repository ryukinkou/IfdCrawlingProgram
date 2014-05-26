package cn.liujinhang.paper.ifc.module;

import java.util.Iterator;

import cn.liujinhang.paper.ifc.system.Constant;
import cn.liujinhang.paper.ifc.system.GobalContext;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class IFCOntologyReader {

	public IFCOntologyReader() {
		GobalContext.IFCOntology = ModelFactory.createOntologyModel();
		GobalContext.IFCOntology.read(Constant.INPUT_IFC_OWL_FILE_PATH);
	}

	public void lanuch() {
		this.findOntologyClasses();
	}

	public void findOntologyClasses() {
		Iterator<OntClass> iterator = GobalContext.IFCOntology.listClasses();
		OntClass clazz = null;
		while (iterator.hasNext()) {
			clazz = iterator.next();
			if (clazz.getURI() != null) {
				GobalContext.IFCOntologyClasses.put(clazz.getURI(), clazz);
			}
		}
	}

}
