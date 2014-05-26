package cn.liujinhang.paper.ifc.system;

import com.hp.hpl.jena.rdf.model.Property;

public class CustomAnnotationProperty {

	public static Property GUID = GobalContext.IFCOntology
			.getProperty(Constant.TARGET_NAMESPACE_WITH_NUMBER_SIGN + "guid");

	public static Property DEFINITION = GobalContext.IFCOntology
			.getProperty(Constant.TARGET_NAMESPACE_WITH_NUMBER_SIGN
					+ "definition");

	public static Property FULL_NAME = GobalContext.IFCOntology
			.getProperty(Constant.TARGET_NAMESPACE_WITH_NUMBER_SIGN
					+ "fullName");

	public static Property SHORT_NAME = GobalContext.IFCOntology
			.getProperty(Constant.TARGET_NAMESPACE_WITH_NUMBER_SIGN
					+ "shortName");

	public static Property STATUS = GobalContext.IFCOntology
			.getProperty(Constant.TARGET_NAMESPACE_WITH_NUMBER_SIGN + "status");

	public static Property VERSION_ID = GobalContext.IFCOntology
			.getProperty(Constant.TARGET_NAMESPACE_WITH_NUMBER_SIGN
					+ "versionId");

	public static Property VERSION_DATE = GobalContext.IFCOntology
			.getProperty(Constant.TARGET_NAMESPACE_WITH_NUMBER_SIGN
					+ "versionDate");

	public static Property LEXEME = GobalContext.IFCOntology
			.getProperty(Constant.TARGET_NAMESPACE_WITH_NUMBER_SIGN + "lexeme");

	public static Property BLOB_STORE_KEY = GobalContext.IFCOntology
			.getProperty(Constant.TARGET_NAMESPACE_WITH_NUMBER_SIGN
					+ "blobstoreKey");

	public static Property ILLUSTRATION_URL = GobalContext.IFCOntology
			.getProperty(Constant.TARGET_NAMESPACE_WITH_NUMBER_SIGN
					+ "illustrationUrl");

}
