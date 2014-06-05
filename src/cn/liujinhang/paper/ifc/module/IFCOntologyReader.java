package cn.liujinhang.paper.ifc.module;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import cn.liujinhang.paper.ifc.system.Constant;
import cn.liujinhang.paper.ifc.system.GobalContext;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class IFCOntologyReader {

	public IFCOntologyReader() {
		GobalContext.IFCOntology = ModelFactory.createOntologyModel();
		GobalContext.IFCOntology.read(Constant.INPUT_IFC_OWL_FILE_PATH);
	}

	public Map<String, OntClass> launch() {
		return this.findOntologyClasses();
	}

	public Map<String, OntClass> findOntologyClasses() {

		Map<String, OntClass> classMap = new HashMap<String, OntClass>();

		Iterator<OntClass> iterator = GobalContext.IFCOntology.listClasses();
		OntClass clazz = null;
		while (iterator.hasNext()) {
			clazz = iterator.next();
			if (clazz.getURI() != null) {
				classMap.put(clazz.getURI(), clazz);
			}
		}

		return classMap;
	}

}
