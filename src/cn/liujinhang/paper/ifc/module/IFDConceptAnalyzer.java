package cn.liujinhang.paper.ifc.module;

import java.util.List;

import no.catenda.peregrine.model.objects.json.IfdConcept;
import no.catenda.peregrine.model.objects.json.IfdConceptTypeEnum;
import no.catenda.peregrine.model.objects.json.IfdName;
import cn.liujinhang.paper.ifc.bean.ResultKey;
import cn.liujinhang.paper.ifc.system.GobalContext;

public class IFDConceptAnalyzer {

	private int count = 0;

	public void launch() {

		for (ResultKey resultKey : GobalContext.IFDConceptResultMap.keySet()) {

			try {
				List<IfdConcept> concepts = GobalContext.IFDConceptResultMap
						.get(resultKey).get();
				if (concepts != null) {
					this.analyze(concepts);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void analyze(List<IfdConcept> concepts) {

		for (IfdConcept concept : concepts) {

			if (null != concept) {

				if (concept.getConceptType() == IfdConceptTypeEnum.SUBJECT) {

					this.count++;

					System.out.println("START-----" + concept.getGuid());
					for (IfdName fullName : concept.getFullNames()) {

						System.out.println(fullName.getLanguage()
								.getNameInSelf()
								+ " | "
								+ fullName.getLanguage().getNameInSelf()
								+ " | " + fullName.getName());

					}
					System.out.println("END-------" + concept.getGuid() + " | "
							+ this.count);

				}

			}

		}

	}

}
