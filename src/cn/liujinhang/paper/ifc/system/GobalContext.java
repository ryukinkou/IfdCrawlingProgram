package cn.liujinhang.paper.ifc.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import com.hp.hpl.jena.ontology.OntClass;

import no.catenda.peregrine.model.objects.json.IfdAPISession;
import no.catenda.peregrine.model.objects.json.IfdConcept;
import cn.liujinhang.paper.ifc.bean.ResultKey;

public class GobalContext {

	public static IfdAPISession IFDSession;

	public static Map<String, OntClass> IFCOntologyClasses = new HashMap<String, OntClass>();

	public static Map<ResultKey, Future<List<IfdConcept>>> IFDConceptResultMap = new HashMap<ResultKey, Future<List<IfdConcept>>>();

}
