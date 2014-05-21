/**
 * IfdRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdRelationship extends
		cn.liujinhang.paper.ifc.webservice.entity.IfdConcept implements
		java.io.Serializable {
	private java.lang.String relationshipType;

	private java.lang.String parent_guid;

	private java.lang.String property_guid;

	private java.lang.String[] children_guid;

	private java.lang.String[] contextGuids;

	public IfdRelationship() {
	}

	public IfdRelationship(
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
			java.lang.String relationshipType, java.lang.String parent_guid,
			java.lang.String property_guid, java.lang.String[] children_guid,
			java.lang.String[] contextGuids) {
		super(guid, versionId, versionDate, status, conceptType, fullNames,
				shortNames, lexemes, definitions, comments, illustrations,
				owner);
		this.relationshipType = relationshipType;
		this.parent_guid = parent_guid;
		this.property_guid = property_guid;
		this.children_guid = children_guid;
		this.contextGuids = contextGuids;
	}

	/**
	 * Gets the relationshipType value for this IfdRelationship.
	 * 
	 * @return relationshipType
	 */
	public java.lang.String getRelationshipType() {
		return relationshipType;
	}

	/**
	 * Sets the relationshipType value for this IfdRelationship.
	 * 
	 * @param relationshipType
	 */
	public void setRelationshipType(java.lang.String relationshipType) {
		this.relationshipType = relationshipType;
	}

	/**
	 * Gets the parent_guid value for this IfdRelationship.
	 * 
	 * @return parent_guid
	 */
	public java.lang.String getParent_guid() {
		return parent_guid;
	}

	/**
	 * Sets the parent_guid value for this IfdRelationship.
	 * 
	 * @param parent_guid
	 */
	public void setParent_guid(java.lang.String parent_guid) {
		this.parent_guid = parent_guid;
	}

	/**
	 * Gets the property_guid value for this IfdRelationship.
	 * 
	 * @return property_guid
	 */
	public java.lang.String getProperty_guid() {
		return property_guid;
	}

	/**
	 * Sets the property_guid value for this IfdRelationship.
	 * 
	 * @param property_guid
	 */
	public void setProperty_guid(java.lang.String property_guid) {
		this.property_guid = property_guid;
	}

	/**
	 * Gets the children_guid value for this IfdRelationship.
	 * 
	 * @return children_guid
	 */
	public java.lang.String[] getChildren_guid() {
		return children_guid;
	}

	/**
	 * Sets the children_guid value for this IfdRelationship.
	 * 
	 * @param children_guid
	 */
	public void setChildren_guid(java.lang.String[] children_guid) {
		this.children_guid = children_guid;
	}

	/**
	 * Gets the contextGuids value for this IfdRelationship.
	 * 
	 * @return contextGuids
	 */
	public java.lang.String[] getContextGuids() {
		return contextGuids;
	}

	/**
	 * Sets the contextGuids value for this IfdRelationship.
	 * 
	 * @param contextGuids
	 */
	public void setContextGuids(java.lang.String[] contextGuids) {
		this.contextGuids = contextGuids;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdRelationship))
			return false;
		IfdRelationship other = (IfdRelationship) obj;
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
				&& ((this.parent_guid == null && other.getParent_guid() == null) || (this.parent_guid != null && this.parent_guid
						.equals(other.getParent_guid())))
				&& ((this.property_guid == null && other.getProperty_guid() == null) || (this.property_guid != null && this.property_guid
						.equals(other.getProperty_guid())))
				&& ((this.children_guid == null && other.getChildren_guid() == null) || (this.children_guid != null && java.util.Arrays
						.equals(this.children_guid, other.getChildren_guid())))
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
		if (getParent_guid() != null) {
			_hashCode += getParent_guid().hashCode();
		}
		if (getProperty_guid() != null) {
			_hashCode += getProperty_guid().hashCode();
		}
		if (getChildren_guid() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getChildren_guid()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getChildren_guid(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
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
			IfdRelationship.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdRelationship"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("relationshipType");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"relationshipType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parent_guid");
		elemField.setXmlName(new javax.xml.namespace.QName("", "parent_guid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("property_guid");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "property_guid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("children_guid");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "children_guid"));
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
