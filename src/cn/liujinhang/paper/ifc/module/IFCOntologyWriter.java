package cn.liujinhang.paper.ifc.module;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.List;

import no.catenda.peregrine.model.objects.json.IfdConcept;
import no.catenda.peregrine.model.objects.json.IfdConceptTypeEnum;
import no.catenda.peregrine.model.objects.json.IfdDescription;
import no.catenda.peregrine.model.objects.json.IfdName;
import cn.liujinhang.paper.ifc.system.Constant;
import cn.liujinhang.paper.ifc.system.CustomAnnotationProperty;
import cn.liujinhang.paper.ifc.system.GobalContext;
import cn.liujinhang.paper.ifc.system.ReflectionUtils;

import com.hp.hpl.jena.ontology.AnnotationProperty;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.tdb.lib.Lib2;

public class IFCOntologyWriter {

	public void launch() {

		for (OntClass ontClazz : GobalContext.IFDConceptResultMap.keySet()) {

			try {
				List<IfdConcept> concepts = GobalContext.IFDConceptResultMap
						.get(ontClazz).get();
				if (concepts != null) {
					this.analyze(ontClazz, concepts);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		File file = new File(Constant.OUTPUT_IFC_OWL_FILE_PATH);
		file.delete();

		try {
			GobalContext.IFCOntology.write(new FileOutputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void analyze(OntClass ontClazz, List<IfdConcept> concepts) {

		for (IfdConcept concept : concepts) {

			if (null != concept) {

				if (concept.getConceptType() == IfdConceptTypeEnum.SUBJECT) {

					this.write(ontClazz, concept.getFullNames(), "name",
							CustomAnnotationProperty.FULL_NAME);

					this.write(ontClazz, concept.getShortNames(), "name",
							CustomAnnotationProperty.SHORT_NAME);

					this.write(ontClazz, concept.getDefinitions(),
							"description", CustomAnnotationProperty.DEFINITION);

					this.write(ontClazz, concept.getIllustrations(),
							"blobstoreKey",
							CustomAnnotationProperty.BLOB_STORE_KEY);

					this.write(ontClazz, concept.getIllustrations(),
							"illustrationUrl",
							CustomAnnotationProperty.ILLUSTRATION_URL);

					this.write(ontClazz, concept.getLexemes(), "name",
							CustomAnnotationProperty.LEXEME);

					this.writeComments(ontClazz, concept.getComments());

					this.writeNames(ontClazz, concept.getFullNames());

					ontClazz.addLiteral(
							CustomAnnotationProperty.GUID,
							GobalContext.IFCOntology.createLiteral(
									concept.getGuid(), "en"));

					ontClazz.addLiteral(CustomAnnotationProperty.STATUS,
							GobalContext.IFCOntology.createLiteral(concept
									.getStatus().name(), "en"));

					ontClazz.addLiteral(
							CustomAnnotationProperty.VERSION_DATE,
							GobalContext.IFCOntology.createLiteral(
									concept.getVersionDate(), "en"));

					ontClazz.addLiteral(
							CustomAnnotationProperty.VERSION_ID,
							GobalContext.IFCOntology.createLiteral(
									concept.getVersionId(), "en"));

				}

			}

		}

	}

	@SuppressWarnings("rawtypes")
	private void write(OntClass ontClazz, List entities, String valueFieldName,
			Property property) {

		if (null == entities || entities.size() == 0) {
			return;
		}

		String value, languageCode;
		Literal content;

		for (Object entity : entities) {

			value = (String) this.invokeMethod(entity, valueFieldName, null);

			languageCode = (String) this.invokeMethod(
					this.invokeMethod(entity, "language", null),
					"languageCode", null);

			content = GobalContext.IFCOntology.createLiteral(value,
					languageCode);

			ontClazz.addLiteral(property, content);
		}

	}

	private Object invokeMethod(Object owner, String fieldName, Object[] args) {

		Class<? extends Object> ownerClass = owner.getClass();

		String methodName = "get" + fieldName.substring(0, 1).toUpperCase()
				+ fieldName.substring(1);

		Method method = null;
		try {
			method = ownerClass.getMethod(methodName);
		} catch (Exception e) {
			return null;
		}

		try {
			return method.invoke(owner, args);
		} catch (Exception e) {
			return null;
		}
	}

	private void writeComments(OntClass ontClazz, List<IfdDescription> comments) {

		if (null == comments || comments.size() == 0) {
			return;
		}

		for (IfdDescription comment : comments) {

			ontClazz.setComment(comment.getDescription(), comment.getLanguage()
					.getLanguageCode());

		}

	}

	private void writeNames(OntClass ontClazz, List<IfdName> names) {

		if (null == names || names.size() == 0) {
			return;
		}

		for (IfdName name : names) {

			ontClazz.setLabel(name.getName(), name.getLanguage()
					.getLanguageCode());

		}

	}

}
