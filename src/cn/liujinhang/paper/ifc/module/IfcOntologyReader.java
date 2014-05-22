package cn.liujinhang.paper.ifc.module;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class IfcOntologyReader {

	public void read() {

		OntModel ontology = ModelFactory.createOntologyModel();
		ontology.read("/Users/RYU/git/IfcTranslateProgram/ifc/ifcOWL.owl");
		Iterator<OntClass> iter = ontology.listClasses();
		
		OntClass clazz = null;
		
		while(iter.hasNext()){
			
			clazz = iter.next();
			
			if(null != clazz.getURI()){
				break;
			}
			
		}
		
		System.out.println(clazz.getURI());
		clazz.setComment("lang", "en");
		
		File output = new File("/Users/RYU/git/IfcTranslateProgram/ifc/ifcOWL2.owl");
		
		OutputStream stream;
		try {
			stream = new FileOutputStream(output);
			ontology.write(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
