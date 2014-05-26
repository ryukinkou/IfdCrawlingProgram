package cn.liujinhang.paper.ifc.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import no.catenda.peregrine.model.objects.json.IfdAPISession;
import no.catenda.peregrine.model.objects.json.IfdConcept;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;

public class GobalContext {

	public static IfdAPISession IFDSession;

	public static OntModel IFCOntology;

	public static Map<String, OntClass> IFCOntologyClasses = new HashMap<String, OntClass>();

	public static Map<OntClass, Future<List<IfdConcept>>> IFDConceptResultMap = new HashMap<OntClass, Future<List<IfdConcept>>>();

}
