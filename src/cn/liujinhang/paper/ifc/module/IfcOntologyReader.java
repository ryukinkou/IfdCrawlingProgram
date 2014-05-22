package cn.liujinhang.paper.ifc.module;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import cn.liujinhang.paper.ifc.system.Constant;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class IfcOntologyReader {

	private OntModel ontology;

	private Map<String, OntClass> ontologyClasses;

	public IfcOntologyReader() {
		this.ontology = ModelFactory.createOntologyModel();
		ontology.read(Constant.IFC_OWL_FILE_PATH);
		this.ontologyClasses = new HashMap<String, OntClass>();
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
				this.ontologyClasses.put(clazz.getURI(), clazz);
			}
		}
	}

	public OntModel getOntology() {
		return ontology;
	}

	public void setOntology(OntModel ontology) {
		this.ontology = ontology;
	}

	public Map<String, OntClass> getOntologyClasses() {
		return ontologyClasses;
	}

	public void setOntologyClasses(Map<String, OntClass> ontologyClasses) {
		this.ontologyClasses = ontologyClasses;
	}

}
