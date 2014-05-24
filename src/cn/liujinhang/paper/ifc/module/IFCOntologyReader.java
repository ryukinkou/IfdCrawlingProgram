package cn.liujinhang.paper.ifc.module;

import java.util.Iterator;

import cn.liujinhang.paper.ifc.system.Constant;
import cn.liujinhang.paper.ifc.system.GobalContext;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class IFCOntologyReader {

	private OntModel ontology;

	

	public IFCOntologyReader() {
		this.ontology = ModelFactory.createOntologyModel();
		ontology.read(Constant.IFC_OWL_FILE_PATH);
	}

	public void read() {
		this.findOntologyClasses();
	}

	public void findOntologyClasses() {
		Iterator<OntClass> iterator = ontology.listClasses();
		OntClass clazz = null;
		while (iterator.hasNext()) {
			clazz = iterator.next();
			if (clazz.getURI() != null) {
				GobalContext.IFCOntologyClasses.put(clazz.getURI(), clazz);
			}
		}
	}

	public OntModel getOntology() {
		return ontology;
	}

	public void setOntology(OntModel ontology) {
		this.ontology = ontology;
	}

}
