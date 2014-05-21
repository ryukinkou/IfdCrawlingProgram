/**
 * Ifd_wsdl_express_v3BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.proxy;

public class Ifd_wsdl_express_v3BindingStub extends org.apache.axis.client.Stub
		implements cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3 {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[87];
		_initOperationDesc1();
		_initOperationDesc2();
		_initOperationDesc3();
		_initOperationDesc4();
		_initOperationDesc5();
		_initOperationDesc6();
		_initOperationDesc7();
		_initOperationDesc8();
		_initOperationDesc9();
	}

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("logout");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("login");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "USER"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "PASSWORD"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getAPIVersion");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_version");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("import_EDM_users");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ORG"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdOrganization"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization.class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EMAIL_SUFFIX"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ROLE_NAME"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("import_delta");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "DELTA"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdDelta"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdDelta.class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "DELTA_PRIORITY"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"logical"),
				cn.liujinhang.paper.ifc.webservice.entity.Logical.class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConflict"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConflict[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_timestamp");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_changes");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "SEARCH_CRITERIA"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "TIMESTAMP"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGE_CODES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdChanges"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdChanges.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_delta_of_concepts");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "SEARCH_CRITERIA"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "TIMESTAMP"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGE_CODES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdDelta"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdDelta.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[8] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("search_within_one_language");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "SEARCH_CRITERIA"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_TYPES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[9] = oper;

	}

	private static void _initOperationDesc2() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateValue");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "THE_VALUE"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdValue"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdValue.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdValue"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdValue.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[10] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateUser");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "IFD_USER"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdUser"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[11] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updatePasswordForUser");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "USER_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "NEW_PASSWORD"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdStringInformation"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[12] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updatePasswordForCurrentUser");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "NEW_PASSWORD"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdStringInformation"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[13] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateOrganization");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ORG"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdOrganization"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdOrganization"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[14] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateName");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "NAME"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdName"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdName.class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdName"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdName.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[15] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateLanguage");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGE"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdLanguage"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[16] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateIllustration");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ILLUSTRATION"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdIllustration"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdIllustration"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[17] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateDescription");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "DESCRIPTION"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdDescription"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdDescription"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[18] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateDefinition");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "DEFINITION"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdDescription"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdDescription"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[19] = oper;

	}

	private static void _initOperationDesc3() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateComment");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "COMMENT"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdDescription"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdDescription"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[20] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateContext");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "THECONTEXT"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdContext"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdContext.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdContext"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdContext.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[21] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateConcept");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdConcept"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[22] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("searchForNames");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "SEARCH_CRITERIA"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "NAME_TYPES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdName"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdName[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[23] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("searchForDuplicatesExt");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdConcept"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "MODE"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[24] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("searchForDuplicates");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdConcept"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[25] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("searchForConcepts");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "SEARCH_CRITERIA"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_TYPES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[26] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("removePreference");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "REPRESENTATION_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdOrganization"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[27] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("removeParentFromConcept");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "PARENT"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdConceptInRelationship"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship.class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "REL_CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConceptInRelationship"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[28] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("removeNameFromContext");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "NAME"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdName"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdName.class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdContext"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdContext.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[29] = oper;

	}

	private static void _initOperationDesc4() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("removeNameFromConcept");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "NAME"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdName"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdName.class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[30] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("removeIllustrationFromConcept");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ILLUSTRATION_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[31] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("removeDefinitionFromConcept");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "DEFINITION"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdDescription"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[32] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("removeContextUser");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "USER"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdUser"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[33] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("removeContextOwner");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "OWNER_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[34] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("removeConstrainedValues");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "PROPERTY_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "MEASURE_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "VALUE_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "REL_CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdMeasureInRelationship"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[35] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("removeCommentFromConcept");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "COMMENT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[36] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("removeChildFromConcept");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CHILD"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdConceptInRelationship"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship.class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "REL_CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConceptInRelationship"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[37] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("mergeDuplicates");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "GUID_TO_KEEP"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "GUID_TO_MERGE"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[38] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("mergeContexts");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "GUID_TO_KEEP"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "GUID_TO_MERGE"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdContext"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdContext.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[39] = oper;

	}

	private static void _initOperationDesc5() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("makeIfdGuid");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[40] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getUsers");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[41] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getTestBuffer");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "SIZE"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdName"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdName.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[42] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getRoles");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdRole"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdRole[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[43] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getRelationshipTypes");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_string"));
		oper.setReturnClass(java.lang.String[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[44] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getParentConcepts");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "RELATIONSHIP_TYPES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConceptInRelationship"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[45] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getOrganizations");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdOrganization"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[46] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getOrganizationMembers");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ORGANIZATION_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[47] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getMeasuresForProperty");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "PROPERTY_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdMeasure"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[48] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getMeasure");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "MEASURE_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdMeasure"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[49] = oper;

	}

	private static void _initOperationDesc6() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getLanguages");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdLanguage"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[50] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getIfdUserFromEmail");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EMAIL"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[51] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getErrorMessage");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ERROR_CODE"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdStringInformation"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[52] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getCurrentUserRights");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_boolean"));
		oper.setReturnClass(boolean[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[53] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getCurrentUser");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[54] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getContextUsers");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[55] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getContexts");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdContext"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdContext[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[56] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getContextOwners");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[57] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getConstrainedValues");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "PROPERTY_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "MEASURE_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdMeasure"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[58] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getConstrainedMeasures");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "PROPERTY_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdMeasureInRelationship"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[59] = oper;

	}

	private static void _initOperationDesc7() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getConceptsFromName");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "NAME_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[60] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getConcept");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[61] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getChildrenConcepts");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "RELATIONSHIP_TYPES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConceptInRelationship"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[62] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getAllContexts");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdContext"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdContext[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[63] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("correctSpellingForName");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "NAME"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdName"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdName.class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdName"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdName.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[64] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("correctSpellingForDescription");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "DESCRIPTION"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdDescription"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdDescription"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[65] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addMeasures");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "MEASURES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdMeasure"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdMeasure"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[66] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addValues");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "VALUES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdValue"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdValue[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdValue"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdValue[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[67] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("registerUsersInDB");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "PASS_SUFFIX"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[68] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addUser");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "USER"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdUser"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "PASSWORD"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[69] = oper;

	}

	private static void _initOperationDesc8() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addRole");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ROLE_NAME"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ACCESS_RIGHTS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_boolean"), boolean[].class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdRole"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdRole.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[70] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addPreference");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "REPRESENTATION_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdOrganization"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[71] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addParents");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "PARENTS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdConceptInRelationship"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "REL_CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConceptInRelationship"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[72] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addOrganizations");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ORGS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdOrganization"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdOrganization"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[73] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addNamesToContext");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "NAMES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdName"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdName[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdName"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdName[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[74] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addNamesToConcept");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "NAMES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdName"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdName[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdName"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdName[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[75] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addLanguages");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "LANGUAGES"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdLanguage"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdLanguage"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[76] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addIllustrations");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ILLUSTRATIONS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdIllustration"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdIllustration"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[77] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addDescriptions");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "DESCRIPTIONS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdDescription"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[].class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "DESCR_TYPE"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdDescription"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[78] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addDefinitionsToConcept");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "DEFINITIONS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdDescription"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdDescription"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[79] = oper;

	}

	private static void _initOperationDesc9() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addContextUsers");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "USER_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[80] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addContexts");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXTS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdContext"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdContext[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdContext"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdContext[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[81] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addContextOwners");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "OWNER_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdUser"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[82] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addConstrainedValues");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "PROPERTY_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "MEASURE_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "VALUE_GUIDS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "REL_CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdMeasure"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[83] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addConcepts");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPTS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdConcept"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConcept"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[84] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addCommentsToConcept");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "COMMENTS"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdDescription"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[].class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdDescription"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[85] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addChildren");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "EDMsessionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CONCEPT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "CHILDREN"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"ListOf_IfdConceptInRelationship"),
				cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "REL_CONTEXT_GUID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConceptInRelationship"));
		oper.setReturnClass(cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "Response"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[86] = oper;

	}

	public Ifd_wsdl_express_v3BindingStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public Ifd_wsdl_express_v3BindingStub(java.net.URL endpointURL,
			javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public Ifd_wsdl_express_v3BindingStub(javax.xml.rpc.Service service)
			throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service)
				.setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"EDMbaseEntity");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdChange");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdChange.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdChanges");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdChanges.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConcept");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConceptInRelationship");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConflict");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdConflict.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdContext");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdContext.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdDelta");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdDelta.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdDescription");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdIllustration");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdLanguage");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdMeasure");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdMeasureInRelationship");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdName");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdName.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdOrganization");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdRelationship");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdRole");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdRole.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdStringInformation");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdUser");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdValue");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdValue.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_boolean");
		cachedSerQNames.add(qName);
		cls = boolean[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdChange");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdChange[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdChange");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConcept");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConcept");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConceptInRelationship");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConceptInRelationship");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdConflict");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdConflict[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConflict");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdContext");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdContext[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdContext");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdDescription");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdDescription");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdIllustration");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdIllustration");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdLanguage");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdLanguage");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdMeasure");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdMeasure");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdMeasureInRelationship");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdMeasureInRelationship");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdName");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdName[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdName");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdOrganization");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdOrganization");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdRelationship");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdRelationship");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdRole");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdRole[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdRole");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdUser");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdUser");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_IfdValue");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.IfdValue[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdValue");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"ListOf_string");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"logical");
		cachedSerQNames.add(qName);
		cls = cn.liujinhang.paper.ifc.webservice.entity.Logical.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

	}

	protected org.apache.axis.client.Call createCall()
			throws java.rmi.RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
					_call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls = (java.lang.Class) cachedSerClasses
								.get(i);
						javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames
								.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class) cachedSerFactories
									.get(i);
							java.lang.Class df = (java.lang.Class) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						} else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
									.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		} catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault(
					"Failure trying to get the Call object", _t);
		}
	}

	public java.lang.String logout(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "logout"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public java.lang.String login(java.lang.String USER,
			java.lang.String PASSWORD) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "login"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					USER, PASSWORD });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public java.lang.String getAPIVersion(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getAPIVersion"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public java.lang.String get_version(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "get_version"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] import_EDM_users(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization ORG,
			java.lang.String EMAIL_SUFFIX, java.lang.String ROLE_NAME)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "import_EDM_users"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, ORG, EMAIL_SUFFIX, ROLE_NAME });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConflict[] import_delta(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDelta DELTA,
			cn.liujinhang.paper.ifc.webservice.entity.Logical DELTA_PRIORITY)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "import_delta"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, DELTA, DELTA_PRIORITY });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConflict[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConflict[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConflict[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public java.lang.String get_timestamp(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "get_timestamp"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdChanges get_changes(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			java.lang.String TIMESTAMP, java.lang.String[] LANGUAGE_CODES,
			java.lang.String[] CONTEXT_GUIDS) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "get_changes"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, SEARCH_CRITERIA, TIMESTAMP, LANGUAGE_CODES,
					CONTEXT_GUIDS });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdChanges) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdChanges) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdChanges.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDelta get_delta_of_concepts(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			java.lang.String TIMESTAMP, java.lang.String[] LANGUAGE_CODES,
			java.lang.String[] CONTEXT_GUIDS) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"get_delta_of_concepts"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, SEARCH_CRITERIA, TIMESTAMP, LANGUAGE_CODES,
					CONTEXT_GUIDS });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDelta) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDelta) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdDelta.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] search_within_one_language(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES,
			java.lang.String[] CONCEPT_TYPES) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"search_within_one_language"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, SEARCH_CRITERIA, LANGUAGES, CONCEPT_TYPES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdValue updateValue(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue THE_VALUE)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[10]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "updateValue"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, THE_VALUE });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdValue) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdValue) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdValue.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser updateUser(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdUser IFD_USER)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[11]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "updateUser"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, IFD_USER });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation updatePasswordForUser(
			java.lang.String EDMsessionId, java.lang.String USER_GUID,
			java.lang.String NEW_PASSWORD) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[12]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"updatePasswordForUser"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, USER_GUID, NEW_PASSWORD });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation updatePasswordForCurrentUser(
			java.lang.String EDMsessionId, java.lang.String NEW_PASSWORD)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[13]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"updatePasswordForCurrentUser"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, NEW_PASSWORD });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization updateOrganization(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization ORG)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[14]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"updateOrganization"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, ORG });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName updateName(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[15]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "updateName"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, NAME });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdName.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage updateLanguage(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage LANGUAGE)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[16]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "updateLanguage"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, LANGUAGE });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration updateIllustration(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration ILLUSTRATION)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[17]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"updateIllustration"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, ILLUSTRATION });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription updateDescription(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DESCRIPTION)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[18]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "updateDescription"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, DESCRIPTION });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription updateDefinition(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DEFINITION)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[19]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "updateDefinition"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, DEFINITION });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription updateComment(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription COMMENT)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[20]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "updateComment"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, COMMENT });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext updateContext(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdContext THECONTEXT)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[21]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "updateContext"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, THECONTEXT });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdContext.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept updateConcept(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept CONCEPT)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[22]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "updateConcept"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] searchForNames(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES,
			java.lang.String[] NAME_TYPES) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[23]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "searchForNames"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, SEARCH_CRITERIA, LANGUAGES, NAME_TYPES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdName[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] searchForDuplicatesExt(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept CONCEPT,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGS,
			java.lang.String MODE) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[24]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"searchForDuplicatesExt"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT, LANGS, MODE });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] searchForDuplicates(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept CONCEPT)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[25]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"searchForDuplicates"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] searchForConcepts(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES,
			java.lang.String[] CONCEPT_TYPES) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[26]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "searchForConcepts"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, SEARCH_CRITERIA, LANGUAGES, CONCEPT_TYPES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] removePreference(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String REPRESENTATION_GUID)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[27]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "removePreference"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, REPRESENTATION_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] removeParentFromConcept(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship PARENT,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[28]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"removeParentFromConcept"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, PARENT, REL_CONTEXT_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext removeNameFromContext(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[29]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"removeNameFromContext"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONTEXT_GUID, NAME });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdContext.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeNameFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[30]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"removeNameFromConcept"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, NAME });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeIllustrationFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String ILLUSTRATION_GUID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[31]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"removeIllustrationFromConcept"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, ILLUSTRATION_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeDefinitionFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DEFINITION)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[32]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"removeDefinitionFromConcept"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, DEFINITION });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] removeContextUser(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdUser USER)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[33]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "removeContextUser"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONTEXT_GUID, USER });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] removeContextOwner(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			java.lang.String OWNER_GUID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[34]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"removeContextOwner"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONTEXT_GUID, OWNER_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[] removeConstrainedValues(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String MEASURE_GUID,
			java.lang.String[] VALUE_GUIDS, java.lang.String REL_CONTEXT_GUID)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[35]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"removeConstrainedValues"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, PROPERTY_GUID, MEASURE_GUID,
					VALUE_GUIDS, REL_CONTEXT_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeCommentFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String COMMENT_GUID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[36]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"removeCommentFromConcept"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, COMMENT_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] removeChildFromConcept(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship CHILD,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[37]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"removeChildFromConcept"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, CHILD, REL_CONTEXT_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept mergeDuplicates(
			java.lang.String EDMsessionId, java.lang.String GUID_TO_KEEP,
			java.lang.String GUID_TO_MERGE) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[38]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "mergeDuplicates"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, GUID_TO_KEEP, GUID_TO_MERGE });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext mergeContexts(
			java.lang.String EDMsessionId, java.lang.String GUID_TO_KEEP,
			java.lang.String GUID_TO_MERGE) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[39]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "mergeContexts"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, GUID_TO_KEEP, GUID_TO_MERGE });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdContext.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public java.lang.String makeIfdGuid(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[40]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "makeIfdGuid"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getUsers(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[41]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getUsers"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName getTestBuffer(
			java.lang.String EDMsessionId, java.lang.String SIZE)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[42]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getTestBuffer"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, SIZE });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdName.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdRole[] getRoles(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[43]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getRoles"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdRole[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdRole[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdRole[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public java.lang.String[] getRelationshipTypes(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[44]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"getRelationshipTypes"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] getParentConcepts(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			java.lang.String[] RELATIONSHIP_TYPES,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[45]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getParentConcepts"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, CONTEXT_GUIDS,
					RELATIONSHIP_TYPES, LANGUAGES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] getOrganizations(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[46]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getOrganizations"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getOrganizationMembers(
			java.lang.String EDMsessionId, java.lang.String ORGANIZATION_GUID)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[47]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"getOrganizationMembers"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, ORGANIZATION_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] getMeasuresForProperty(
			java.lang.String EDMsessionId, java.lang.String PROPERTY_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[48]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"getMeasuresForProperty"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, PROPERTY_GUID, CONTEXT_GUIDS, LANGUAGES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure getMeasure(
			java.lang.String EDMsessionId, java.lang.String MEASURE_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[49]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getMeasure"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, MEASURE_GUID, CONTEXT_GUIDS, LANGUAGES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] getLanguages(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[50]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getLanguages"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser getIfdUserFromEmail(
			java.lang.String EDMsessionId, java.lang.String EMAIL)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[51]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"getIfdUserFromEmail"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, EMAIL });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation getErrorMessage(
			java.lang.String EDMsessionId, int ERROR_CODE)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[52]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getErrorMessage"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, new java.lang.Integer(ERROR_CODE) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public boolean[] getCurrentUserRights(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[53]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"getCurrentUserRights"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (boolean[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (boolean[]) org.apache.axis.utils.JavaUtils.convert(
							_resp, boolean[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser getCurrentUser(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[54]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getCurrentUser"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getContextUsers(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[55]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getContextUsers"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONTEXT_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] getContexts(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[56]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getContexts"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdContext[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getContextOwners(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[57]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getContextOwners"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONTEXT_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure getConstrainedValues(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String MEASURE_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[58]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"getConstrainedValues"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, PROPERTY_GUID, MEASURE_GUID,
					CONTEXT_GUIDS, LANGUAGES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[] getConstrainedMeasures(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[59]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"getConstrainedMeasures"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, PROPERTY_GUID, CONTEXT_GUIDS,
					LANGUAGES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] getConceptsFromName(
			java.lang.String EDMsessionId, java.lang.String NAME_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[60]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"getConceptsFromName"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, NAME_GUID, LANGUAGES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept getConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[61]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getConcept"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, LANGUAGES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] getChildrenConcepts(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			java.lang.String[] RELATIONSHIP_TYPES,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[62]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"getChildrenConcepts"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, CONTEXT_GUIDS,
					RELATIONSHIP_TYPES, LANGUAGES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] getAllContexts(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[63]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "getAllContexts"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { EDMsessionId });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdContext[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName correctSpellingForName(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[64]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"correctSpellingForName"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, NAME });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdName.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription correctSpellingForDescription(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DESCRIPTION)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[65]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"correctSpellingForDescription"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, DESCRIPTION });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdDescription.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] addMeasures(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] MEASURES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[66]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addMeasures"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, MEASURES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] addValues(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] VALUES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[67]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addValues"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, VALUES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdValue[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdValue[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdValue[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] registerUsersInDB(
			java.lang.String EDMsessionId, java.lang.String[] GUIDS,
			java.lang.String PASS_SUFFIX) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[68]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "registerUsersInDB"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, GUIDS, PASS_SUFFIX });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser addUser(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdUser USER,
			java.lang.String PASSWORD) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[69]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addUser"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, USER, PASSWORD });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdRole addRole(
			java.lang.String EDMsessionId, java.lang.String ROLE_NAME,
			boolean[] ACCESS_RIGHTS) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[70]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addRole"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, ROLE_NAME, ACCESS_RIGHTS });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdRole) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdRole) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdRole.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] addPreference(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String REPRESENTATION_GUID)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[71]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addPreference"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, REPRESENTATION_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] addParents(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] PARENTS,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[72]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addParents"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, PARENTS, REL_CONTEXT_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] addOrganizations(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] ORGS)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[73]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addOrganizations"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, ORGS });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] addNamesToContext(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] NAMES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[74]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addNamesToContext"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONTEXT_GUID, NAMES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdName[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] addNamesToConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] NAMES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[75]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addNamesToConcept"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, NAMES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdName[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdName[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] addLanguages(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[76]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addLanguages"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, LANGUAGES });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[] addIllustrations(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[] ILLUSTRATIONS)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[77]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addIllustrations"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, ILLUSTRATIONS });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] addDescriptions(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] DESCRIPTIONS,
			java.lang.String DESCR_TYPE) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[78]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addDescriptions"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, DESCRIPTIONS, DESCR_TYPE });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] addDefinitionsToConcept(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] DEFINITIONS)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[79]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"addDefinitionsToConcept"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, DEFINITIONS });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] addContextUsers(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			java.lang.String[] USER_GUIDS) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[80]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addContextUsers"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONTEXT_GUID, USER_GUIDS });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] addContexts(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] CONTEXTS)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[81]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addContexts"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONTEXTS });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdContext[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdContext[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] addContextOwners(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			java.lang.String[] OWNER_GUIDS) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[82]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addContextOwners"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONTEXT_GUID, OWNER_GUIDS });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdUser[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdUser[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure addConstrainedValues(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String MEASURE_GUID,
			java.lang.String[] VALUE_GUIDS, java.lang.String REL_CONTEXT_GUID)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[83]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"addConstrainedValues"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, PROPERTY_GUID, MEASURE_GUID,
					VALUE_GUIDS, REL_CONTEXT_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] addConcepts(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] CONCEPTS)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[84]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addConcepts"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPTS });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] addCommentsToConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] COMMENTS)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[85]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"addCommentsToConcept"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, COMMENTS });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] addChildren(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] CHILDREN,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[86]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/", "addChildren"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					EDMsessionId, CONCEPT_GUID, CHILDREN, REL_CONTEXT_GUID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
