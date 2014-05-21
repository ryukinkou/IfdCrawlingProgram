package cn.liujinhang.paper.ifc;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import cn.liujinhang.paper.ifc.thread.IdfConceptCrawlingThread;
import cn.liujinhang.paper.ifc.webservice.entity.IfdConcept;

public class IfdSpaider {

	public void crawling() {

		ExecutorService pool = Executors.newFixedThreadPool(1);

		String[] classNames = { "IfcActor", "IfcAddress", "IfcDoor",
				"IfcPerson", "IfcTable" };

		ArrayList<Future<IfdConcept[]>> result = new ArrayList<Future<IfdConcept[]>>();

		for (int i = 0; i < classNames.length; i++) {

			IdfConceptCrawlingThread thread = new IdfConceptCrawlingThread();
			thread.setKeyword(classNames[i]);

			Future<IfdConcept[]> future = pool.submit(thread);
			result.add(future);

		}

		for (Future<IfdConcept[]> future : result) {

			try {

				System.out.println(future.get()[0].getFullNames()[0]
						.getNameType());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
