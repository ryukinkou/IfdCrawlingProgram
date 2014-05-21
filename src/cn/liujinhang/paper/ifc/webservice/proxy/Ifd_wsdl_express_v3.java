/**
 * Ifd_wsdl_express_v3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.proxy;

public interface Ifd_wsdl_express_v3 extends java.rmi.Remote {
	public java.lang.String logout(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException;

	public java.lang.String login(java.lang.String USER,
			java.lang.String PASSWORD) throws java.rmi.RemoteException;

	public java.lang.String getAPIVersion(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException;

	public java.lang.String get_version(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] import_EDM_users(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization ORG,
			java.lang.String EMAIL_SUFFIX, java.lang.String ROLE_NAME)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConflict[] import_delta(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDelta DELTA,
			cn.liujinhang.paper.ifc.webservice.entity.Logical DELTA_PRIORITY)
			throws java.rmi.RemoteException;

	public java.lang.String get_timestamp(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdChanges get_changes(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			java.lang.String TIMESTAMP, java.lang.String[] LANGUAGE_CODES,
			java.lang.String[] CONTEXT_GUIDS) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDelta get_delta_of_concepts(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			java.lang.String TIMESTAMP, java.lang.String[] LANGUAGE_CODES,
			java.lang.String[] CONTEXT_GUIDS) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] search_within_one_language(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES,
			java.lang.String[] CONCEPT_TYPES) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdValue updateValue(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue THE_VALUE)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser updateUser(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdUser IFD_USER)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation updatePasswordForUser(
			java.lang.String EDMsessionId, java.lang.String USER_GUID,
			java.lang.String NEW_PASSWORD) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation updatePasswordForCurrentUser(
			java.lang.String EDMsessionId, java.lang.String NEW_PASSWORD)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization updateOrganization(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization ORG)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName updateName(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage updateLanguage(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage LANGUAGE)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration updateIllustration(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration ILLUSTRATION)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription updateDescription(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DESCRIPTION)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription updateDefinition(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DEFINITION)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription updateComment(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription COMMENT)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext updateContext(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdContext THECONTEXT)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept updateConcept(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept CONCEPT)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] searchForNames(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES,
			java.lang.String[] NAME_TYPES) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] searchForDuplicatesExt(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept CONCEPT,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGS,
			java.lang.String MODE) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] searchForDuplicates(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept CONCEPT)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] searchForConcepts(
			java.lang.String EDMsessionId, java.lang.String SEARCH_CRITERIA,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES,
			java.lang.String[] CONCEPT_TYPES) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] removePreference(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String REPRESENTATION_GUID)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] removeParentFromConcept(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship PARENT,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext removeNameFromContext(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeNameFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeIllustrationFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String ILLUSTRATION_GUID) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeDefinitionFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DEFINITION)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] removeContextUser(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdUser USER)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] removeContextOwner(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			java.lang.String OWNER_GUID) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[] removeConstrainedValues(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String MEASURE_GUID,
			java.lang.String[] VALUE_GUIDS, java.lang.String REL_CONTEXT_GUID)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept removeCommentFromConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String COMMENT_GUID) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] removeChildFromConcept(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship CHILD,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept mergeDuplicates(
			java.lang.String EDMsessionId, java.lang.String GUID_TO_KEEP,
			java.lang.String GUID_TO_MERGE) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext mergeContexts(
			java.lang.String EDMsessionId, java.lang.String GUID_TO_KEEP,
			java.lang.String GUID_TO_MERGE) throws java.rmi.RemoteException;

	public java.lang.String makeIfdGuid(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getUsers(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName getTestBuffer(
			java.lang.String EDMsessionId, java.lang.String SIZE)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdRole[] getRoles(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException;

	public java.lang.String[] getRelationshipTypes(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] getParentConcepts(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			java.lang.String[] RELATIONSHIP_TYPES,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] getOrganizations(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getOrganizationMembers(
			java.lang.String EDMsessionId, java.lang.String ORGANIZATION_GUID)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] getMeasuresForProperty(
			java.lang.String EDMsessionId, java.lang.String PROPERTY_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure getMeasure(
			java.lang.String EDMsessionId, java.lang.String MEASURE_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] getLanguages(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser getIfdUserFromEmail(
			java.lang.String EDMsessionId, java.lang.String EMAIL)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdStringInformation getErrorMessage(
			java.lang.String EDMsessionId, int ERROR_CODE)
			throws java.rmi.RemoteException;

	public boolean[] getCurrentUserRights(java.lang.String EDMsessionId)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser getCurrentUser(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getContextUsers(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] getContexts(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] getContextOwners(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure getConstrainedValues(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String MEASURE_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasureInRelationship[] getConstrainedMeasures(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String[] CONTEXT_GUIDS,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] getConceptsFromName(
			java.lang.String EDMsessionId, java.lang.String NAME_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept getConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] getChildrenConcepts(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String[] CONTEXT_GUIDS,
			java.lang.String[] RELATIONSHIP_TYPES,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] getAllContexts(
			java.lang.String EDMsessionId) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName correctSpellingForName(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName NAME)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription correctSpellingForDescription(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription DESCRIPTION)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] addMeasures(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] MEASURES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] addValues(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] VALUES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] registerUsersInDB(
			java.lang.String EDMsessionId, java.lang.String[] GUIDS,
			java.lang.String PASS_SUFFIX) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser addUser(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdUser USER,
			java.lang.String PASSWORD) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdRole addRole(
			java.lang.String EDMsessionId, java.lang.String ROLE_NAME,
			boolean[] ACCESS_RIGHTS) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] addPreference(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String REPRESENTATION_GUID)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] addParents(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] PARENTS,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] addOrganizations(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] ORGS)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] addNamesToContext(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] NAMES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] addNamesToConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] NAMES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] addLanguages(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage[] LANGUAGES)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[] addIllustrations(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[] ILLUSTRATIONS)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] addDescriptions(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] DESCRIPTIONS,
			java.lang.String DESCR_TYPE) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] addDefinitionsToConcept(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] DEFINITIONS)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] addContextUsers(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			java.lang.String[] USER_GUIDS) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] addContexts(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdContext[] CONTEXTS)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdUser[] addContextOwners(
			java.lang.String EDMsessionId, java.lang.String CONTEXT_GUID,
			java.lang.String[] OWNER_GUIDS) throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure addConstrainedValues(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			java.lang.String PROPERTY_GUID, java.lang.String MEASURE_GUID,
			java.lang.String[] VALUE_GUIDS, java.lang.String REL_CONTEXT_GUID)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] addConcepts(
			java.lang.String EDMsessionId,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] CONCEPTS)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] addCommentsToConcept(
			java.lang.String EDMsessionId, java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] COMMENTS)
			throws java.rmi.RemoteException;

	public cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] addChildren(
			java.lang.String EDMsessionId,
			java.lang.String CONCEPT_GUID,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConceptInRelationship[] CHILDREN,
			java.lang.String REL_CONTEXT_GUID) throws java.rmi.RemoteException;
}
