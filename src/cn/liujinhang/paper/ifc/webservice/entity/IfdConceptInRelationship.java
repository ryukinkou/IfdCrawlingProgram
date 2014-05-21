/**
 * IfdConceptInRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdConceptInRelationship extends
		cn.liujinhang.paper.ifc.webservice.entity.IfdConcept implements
		java.io.Serializable {
	private java.lang.String relationshipType;

	private java.lang.String[] contextGuids;

	public IfdConceptInRelationship() {
	}

	public IfdConceptInRelationship(
			java.lang.String guid,
			java.lang.String versionId,
			java.lang.String versionDate,
			java.lang.String status,
			java.lang.String conceptType,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] fullNames,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] shortNames,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] lexemes,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] definitions,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] comments,
			cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[] illustrations,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization owner,
			java.lang.String relationshipType, java.lang.String[] contextGuids) {
		super(guid, versionId, versionDate, status, conceptType, fullNames,
				shortNames, lexemes, definitions, comments, illustrations,
				owner);
		this.relationshipType = relationshipType;
		this.contextGuids = contextGuids;
	}

	/**
	 * Gets the relationshipType value for this IfdConceptInRelationship.
	 * 
	 * @return relationshipType
	 */
	public java.lang.String getRelationshipType() {
		return relationshipType;
	}

	/**
	 * Sets the relationshipType value for this IfdConceptInRelationship.
	 * 
	 * @param relationshipType
	 */
	public void setRelationshipType(java.lang.String relationshipType) {
		this.relationshipType = relationshipType;
	}

	/**
	 * Gets the contextGuids value for this IfdConceptInRelationship.
	 * 
	 * @return contextGuids
	 */
	public java.lang.String[] getContextGuids() {
		return contextGuids;
	}

	/**
	 * Sets the contextGuids value for this IfdConceptInRelationship.
	 * 
	 * @param contextGuids
	 */
	public void setContextGuids(java.lang.String[] contextGuids) {
		this.contextGuids = contextGuids;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdConceptInRelationship))
			return false;
		IfdConceptInRelationship other = (IfdConceptInRelationship) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj)
				&& ((this.relationshipType == null && other
						.getRelationshipType() == null) || (this.relationshipType != null && this.relationshipType
						.equals(other.getRelationshipType())))
				&& ((this.contextGuids == null && other.getContextGuids() == null) || (this.contextGuids != null && java.util.Arrays
						.equals(this.contextGuids, other.getContextGuids())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = super.hashCode();
		if (getRelationshipType() != null) {
			_hashCode += getRelationshipType().hashCode();
		}
		if (getContextGuids() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getContextGuids()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getContextGuids(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			IfdConceptInRelationship.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConceptInRelationship"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("relationshipType");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"relationshipType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("contextGuids");
		elemField.setXmlName(new javax.xml.namespace.QName("", "contextGuids"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
