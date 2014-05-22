package cn.liujinhang.paper.ifc.module;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import no.catenda.peregrine.model.objects.json.IfdConcept;
import cn.liujinhang.paper.ifc.module.thread.IdfConceptCrawlingThread;

public class IfdLibrarySpaider {

	public void crawling(){

//		ExecutorService pool = Executors.newFixedThreadPool(1);
//
//		String[] classNames = { "IfcActor", "IfcAddress", "IfcDoor",
//				"IfcPerson", "IfcTable" };
//
//		ArrayList<Future<IfdConcept>> result = new ArrayList<Future<IfdConcept>>();
//
//		for (int i = 0; i < classNames.length; i++) {
//
//			IdfConceptCrawlingThread<IfdConcept> thread = new IdfConceptCrawlingThread<IfdConcept>();
//			thread.setKeyword(classNames[i]);
//
//			Future<IfdConcept> future = pool.submit(thread);
//			result.add(future);
//
//		}
//
//		for (Future<IfdConcept> future : result) {
//			
//
//		}

		IdfConceptCrawlingThread<IfdConcept> thread = new IdfConceptCrawlingThread<IfdConcept>();
		
		try {
			thread.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
