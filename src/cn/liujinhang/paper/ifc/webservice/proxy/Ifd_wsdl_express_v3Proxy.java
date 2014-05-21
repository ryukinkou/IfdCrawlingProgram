package cn.liujinhang.paper.ifc.webservice.proxy;

public class Ifd_wsdl_express_v3Proxy implements
		cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3 {
	private String _endpoint = null;
	private cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3 ifd_wsdl_express_v3 = null;

	public Ifd_wsdl_express_v3Proxy() {
		_initIfd_wsdl_express_v3Proxy();
	}

	public Ifd_wsdl_express_v3Proxy(String endpoint) {
		_endpoint = endpoint;
		_initIfd_wsdl_express_v3Proxy();
	}

	private void _initIfd_wsdl_express_v3Proxy() {
		try {
			ifd_wsdl_express_v3 = (new cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3ServiceLocator())
					.getEDMWS();
			if (ifd_wsdl_express_v3 != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) ifd_wsdl_express_v3)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) ifd_wsdl_express_v3)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (ifd_wsdl_express_v3 != null)
			((javax.xml.rpc.Stub) ifd_wsdl_express_v3)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3 getIfd_wsdl_express_v3() {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3;
	}

	public java.lang.String logout(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.logout(EDMsessionId);
	}

	public java.lang.String login(java.lang.String USER,
			java.lang.String PASSWORD) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.login(USER, PASSWORD);
	}

	public java.lang.String getAPIVersion(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getAPIVersion(EDMsessionId);
	}

	public java.lang.String get_version(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.get_version(EDMsessionId);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] import_EDM_users(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization ORG,
			java.lang.String EMAIL_SUFFIX, java.lang.String ROLE_NAME)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.import_EDM_users(EDMsessionId, ORG,
				EMAIL_SUFFIX, ROLE_NAME);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConflict[] import_delta(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDelta DELTA,
			cn.liujinhang.paper.ifc.webservice.entity.Logical DELTA_PRIORITY)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.import_delta(EDMsessionId, DELTA,
				DELTA_PRIORITY);
	}

	public java.lang.String get_timestamp(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.get_timestamp(EDMsessionId);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdChanges get_changes(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			java.lang.String TIMESTAMP, java.lang.String[] LANGUAGE_CODES,
			java.lang.String[] CONTEXT_GUIDS) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.get_changes(EDMsessionId, SEARCH_CRITERIA,
				TIMESTAMP, LANGUAGE_CODES, CONTEXT_GUIDS);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDelta get_delta_of_concepts(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			java.lang.String TIMESTAMP, java.lang.String[] LANGUAGE_CODES,
			java.lang.String[] CONTEXT_GUIDS) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.get_delta_of_concepts(EDMsessionId,
				SEARCH_CRITERIA, TIMESTAMP, LANGUAGE_CODES, CONTEXT_GUIDS);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] search_within_one_language(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES,
			java.lang.String[] CONCEPT_TYPES) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.search_within_one_language(EDMsessionId,
				SEARCH_CRITERIA, LANGUAGES, CONCEPT_TYPES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdValue updateValue(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue THE_VALUE)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updateValue(EDMsessionId, THE_VALUE);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser updateUser(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdUser IFD_USER)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updateUser(EDMsessionId, IFD_USER);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation updatePasswordForUser(
			java.lang.String EDMsessionId, java.lang.String USER_GUID,
			java.lang.String NEW_PASSWORD) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updatePasswordForUser(EDMsessionId,
				USER_GUID, NEW_PASSWORD);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation updatePasswordForCurrentUser(
			java.lang.String EDMsessionId, java.lang.String NEW_PASSWORD)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updatePasswordForCurrentUser(EDMsessionId,
				NEW_PASSWORD);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization updateOrganization(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization ORG)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updateOrganization(EDMsessionId, ORG);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName updateName(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updateName(EDMsessionId, CONCEPT_GUID, NAME);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage updateLanguage(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage LANGUAGE)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updateLanguage(EDMsessionId, LANGUAGE);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration updateIllustration(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration ILLUSTRATION)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updateIllustration(EDMsessionId,
				CONCEPT_GUID, ILLUSTRATION);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription updateDescription(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DESCRIPTION)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updateDescription(EDMsessionId,
				CONCEPT_GUID, DESCRIPTION);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription updateDefinition(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DEFINITION)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updateDefinition(EDMsessionId, CONCEPT_GUID,
				DEFINITION);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription updateComment(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription COMMENT)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updateComment(EDMsessionId, CONCEPT_GUID,
				COMMENT);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext updateContext(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdContext THECONTEXT)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updateContext(EDMsessionId, THECONTEXT);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept updateConcept(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept CONCEPT)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.updateConcept(EDMsessionId, CONCEPT);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] searchForNames(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES,
			java.lang.String[] NAME_TYPES) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.searchForNames(EDMsessionId,
				SEARCH_CRITERIA, LANGUAGES, NAME_TYPES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] searchForDuplicatesExt(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept CONCEPT,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGS,
			java.lang.String MODE) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.searchForDuplicatesExt(EDMsessionId,
				CONCEPT, LANGS, MODE);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] searchForDuplicates(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept CONCEPT)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.searchForDuplicates(EDMsessionId, CONCEPT);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] searchForConcepts(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES,
			java.lang.String[] CONCEPT_TYPES) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.searchForConcepts(EDMsessionId,
				SEARCH_CRITERIA, LANGUAGES, CONCEPT_TYPES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] removePreference(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String REPRESENTATION_GUID)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.removePreference(EDMsessionId, CONCEPT_GUID,
				REPRESENTATION_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] removeParentFromConcept(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship PARENT,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.removeParentFromConcept(EDMsessionId,
				CONCEPT_GUID, PARENT, REL_CONTEXT_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext removeNameFromContext(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.removeNameFromContext(EDMsessionId,
				CONTEXT_GUID, NAME);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeNameFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.removeNameFromConcept(EDMsessionId,
				CONCEPT_GUID, NAME);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeIllustrationFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String ILLUSTRATION_GUID) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.removeIllustrationFromConcept(EDMsessionId,
				CONCEPT_GUID, ILLUSTRATION_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeDefinitionFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DEFINITION)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.removeDefinitionFromConcept(EDMsessionId,
				CONCEPT_GUID, DEFINITION);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] removeContextUser(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdUser USER)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.removeContextUser(EDMsessionId,
				CONTEXT_GUID, USER);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] removeContextOwner(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			java.lang.String OWNER_GUID) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.removeContextOwner(EDMsessionId,
				CONTEXT_GUID, OWNER_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[] removeConstrainedValues(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String MEASURE_GUID,
			java.lang.String[] VALUE_GUIDS, java.lang.String REL_CONTEXT_GUID)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.removeConstrainedValues(EDMsessionId,
				CONCEPT_GUID, PROPERTY_GUID, MEASURE_GUID, VALUE_GUIDS,
				REL_CONTEXT_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeCommentFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String COMMENT_GUID) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.removeCommentFromConcept(EDMsessionId,
				CONCEPT_GUID, COMMENT_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] removeChildFromConcept(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship CHILD,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.removeChildFromConcept(EDMsessionId,
				CONCEPT_GUID, CHILD, REL_CONTEXT_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept mergeDuplicates(
			java.lang.String EDMsessionId, java.lang.String GUID_TO_KEEP,
			java.lang.String GUID_TO_MERGE) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.mergeDuplicates(EDMsessionId, GUID_TO_KEEP,
				GUID_TO_MERGE);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext mergeContexts(
			java.lang.String EDMsessionId, java.lang.String GUID_TO_KEEP,
			java.lang.String GUID_TO_MERGE) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.mergeContexts(EDMsessionId, GUID_TO_KEEP,
				GUID_TO_MERGE);
	}

	public java.lang.String makeIfdGuid(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.makeIfdGuid(EDMsessionId);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getUsers(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getUsers(EDMsessionId);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName getTestBuffer(
			java.lang.String EDMsessionId, java.lang.String SIZE)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getTestBuffer(EDMsessionId, SIZE);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdRole[] getRoles(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getRoles(EDMsessionId);
	}

	public java.lang.String[] getRelationshipTypes(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getRelationshipTypes(EDMsessionId);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] getParentConcepts(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			java.lang.String[] RELATIONSHIP_TYPES,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getParentConcepts(EDMsessionId,
				CONCEPT_GUID, CONTEXT_GUIDS, RELATIONSHIP_TYPES, LANGUAGES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] getOrganizations(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getOrganizations(EDMsessionId);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getOrganizationMembers(
			java.lang.String EDMsessionId, java.lang.String ORGANIZATION_GUID)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getOrganizationMembers(EDMsessionId,
				ORGANIZATION_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] getMeasuresForProperty(
			java.lang.String EDMsessionId, java.lang.String PROPERTY_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getMeasuresForProperty(EDMsessionId,
				PROPERTY_GUID, CONTEXT_GUIDS, LANGUAGES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure getMeasure(
			java.lang.String EDMsessionId, java.lang.String MEASURE_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getMeasure(EDMsessionId, MEASURE_GUID,
				CONTEXT_GUIDS, LANGUAGES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] getLanguages(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getLanguages(EDMsessionId);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser getIfdUserFromEmail(
			java.lang.String EDMsessionId, java.lang.String EMAIL)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getIfdUserFromEmail(EDMsessionId, EMAIL);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation getErrorMessage(
			java.lang.String EDMsessionId, int ERROR_CODE)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getErrorMessage(EDMsessionId, ERROR_CODE);
	}

	public boolean[] getCurrentUserRights(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getCurrentUserRights(EDMsessionId);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser getCurrentUser(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getCurrentUser(EDMsessionId);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getContextUsers(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getContextUsers(EDMsessionId, CONTEXT_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] getContexts(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getContexts(EDMsessionId);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getContextOwners(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getContextOwners(EDMsessionId, CONTEXT_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure getConstrainedValues(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String MEASURE_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getConstrainedValues(EDMsessionId,
				CONCEPT_GUID, PROPERTY_GUID, MEASURE_GUID, CONTEXT_GUIDS,
				LANGUAGES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[] getConstrainedMeasures(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getConstrainedMeasures(EDMsessionId,
				CONCEPT_GUID, PROPERTY_GUID, CONTEXT_GUIDS, LANGUAGES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] getConceptsFromName(
			java.lang.String EDMsessionId, java.lang.String NAME_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getConceptsFromName(EDMsessionId, NAME_GUID,
				LANGUAGES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept getConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getConcept(EDMsessionId, CONCEPT_GUID,
				LANGUAGES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] getChildrenConcepts(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			java.lang.String[] RELATIONSHIP_TYPES,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getChildrenConcepts(EDMsessionId,
				CONCEPT_GUID, CONTEXT_GUIDS, RELATIONSHIP_TYPES, LANGUAGES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] getAllContexts(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.getAllContexts(EDMsessionId);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName correctSpellingForName(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.correctSpellingForName(EDMsessionId, NAME);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription correctSpellingForDescription(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DESCRIPTION)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.correctSpellingForDescription(EDMsessionId,
				DESCRIPTION);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] addMeasures(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] MEASURES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addMeasures(EDMsessionId, MEASURES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] addValues(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] VALUES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addValues(EDMsessionId, VALUES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] registerUsersInDB(
			java.lang.String EDMsessionId, java.lang.String[] GUIDS,
			java.lang.String PASS_SUFFIX) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.registerUsersInDB(EDMsessionId, GUIDS,
				PASS_SUFFIX);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser addUser(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdUser USER,
			java.lang.String PASSWORD) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addUser(EDMsessionId, USER, PASSWORD);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdRole addRole(
			java.lang.String EDMsessionId, java.lang.String ROLE_NAME,
			boolean[] ACCESS_RIGHTS) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addRole(EDMsessionId, ROLE_NAME,
				ACCESS_RIGHTS);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] addPreference(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String REPRESENTATION_GUID)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addPreference(EDMsessionId, CONCEPT_GUID,
				REPRESENTATION_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] addParents(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] PARENTS,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addParents(EDMsessionId, CONCEPT_GUID,
				PARENTS, REL_CONTEXT_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] addOrganizations(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] ORGS)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addOrganizations(EDMsessionId, ORGS);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] addNamesToContext(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] NAMES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addNamesToContext(EDMsessionId,
				CONTEXT_GUID, NAMES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] addNamesToConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] NAMES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addNamesToConcept(EDMsessionId,
				CONCEPT_GUID, NAMES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] addLanguages(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addLanguages(EDMsessionId, LANGUAGES);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[] addIllustrations(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[] ILLUSTRATIONS)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addIllustrations(EDMsessionId, CONCEPT_GUID,
				ILLUSTRATIONS);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] addDescriptions(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] DESCRIPTIONS,
			java.lang.String DESCR_TYPE) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addDescriptions(EDMsessionId, CONCEPT_GUID,
				DESCRIPTIONS, DESCR_TYPE);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] addDefinitionsToConcept(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] DEFINITIONS)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addDefinitionsToConcept(EDMsessionId,
				CONCEPT_GUID, DEFINITIONS);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] addContextUsers(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			java.lang.String[] USER_GUIDS) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addContextUsers(EDMsessionId, CONTEXT_GUID,
				USER_GUIDS);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] addContexts(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] CONTEXTS)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addContexts(EDMsessionId, CONTEXTS);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] addContextOwners(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			java.lang.String[] OWNER_GUIDS) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addContextOwners(EDMsessionId, CONTEXT_GUID,
				OWNER_GUIDS);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure addConstrainedValues(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String MEASURE_GUID,
			java.lang.String[] VALUE_GUIDS, java.lang.String REL_CONTEXT_GUID)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addConstrainedValues(EDMsessionId,
				CONCEPT_GUID, PROPERTY_GUID, MEASURE_GUID, VALUE_GUIDS,
				REL_CONTEXT_GUID);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] addConcepts(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] CONCEPTS)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addConcepts(EDMsessionId, CONCEPTS);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] addCommentsToConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] COMMENTS)
			throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addCommentsToConcept(EDMsessionId,
				CONCEPT_GUID, COMMENTS);
	}

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] addChildren(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] CHILDREN,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException {
		if (ifd_wsdl_express_v3 == null)
			_initIfd_wsdl_express_v3Proxy();
		return ifd_wsdl_express_v3.addChildren(EDMsessionId, CONCEPT_GUID,
				CHILDREN, REL_CONTEXT_GUID);
	}

}