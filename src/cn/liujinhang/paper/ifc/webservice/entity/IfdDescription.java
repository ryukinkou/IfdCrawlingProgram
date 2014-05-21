/**
 * IfdDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdDescription extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String guid;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage language;

	private java.lang.String description;

	private java.lang.String descriptionType;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] preferredBy;

	public IfdDescription() {
	}

	public IfdDescription(
			java.lang.String guid,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage language,
			java.lang.String description,
			java.lang.String descriptionType,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] preferredBy) {
		this.guid = guid;
		this.language = language;
		this.description = description;
		this.descriptionType = descriptionType;
		this.preferredBy = preferredBy;
	}

	/**
	 * Gets the guid value for this IfdDescription.
	 * 
	 * @return guid
	 */
	public java.lang.String getGuid() {
		return guid;
	}

	/**
	 * Sets the guid value for this IfdDescription.
	 * 
	 * @param guid
	 */
	public void setGuid(java.lang.String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the language value for this IfdDescription.
	 * 
	 * @return language
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage getLanguage() {
		return language;
	}

	/**
	 * Sets the language value for this IfdDescription.
	 * 
	 * @param language
	 */
	public void setLanguage(
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage language) {
		this.language = language;
	}

	/**
	 * Gets the description value for this IfdDescription.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this IfdDescription.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * Gets the descriptionType value for this IfdDescription.
	 * 
	 * @return descriptionType
	 */
	public java.lang.String getDescriptionType() {
		return descriptionType;
	}

	/**
	 * Sets the descriptionType value for this IfdDescription.
	 * 
	 * @param descriptionType
	 */
	public void setDescriptionType(java.lang.String descriptionType) {
		this.descriptionType = descriptionType;
	}

	/**
	 * Gets the preferredBy value for this IfdDescription.
	 * 
	 * @return preferredBy
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] getPreferredBy() {
		return preferredBy;
	}

	/**
	 * Sets the preferredBy value for this IfdDescription.
	 * 
	 * @param preferredBy
	 */
	public void setPreferredBy(
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] preferredBy) {
		this.preferredBy = preferredBy;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdDescription))
			return false;
		IfdDescription other = (IfdDescription) obj;
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
				&& ((this.guid == null && other.getGuid() == null) || (this.guid != null && this.guid
						.equals(other.getGuid())))
				&& ((this.language == null && other.getLanguage() == null) || (this.language != null && this.language
						.equals(other.getLanguage())))
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& ((this.descriptionType == null && other.getDescriptionType() == null) || (this.descriptionType != null && this.descriptionType
						.equals(other.getDescriptionType())))
				&& ((this.preferredBy == null && other.getPreferredBy() == null) || (this.preferredBy != null && java.util.Arrays
						.equals(this.preferredBy, other.getPreferredBy())));
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
		if (getGuid() != null) {
			_hashCode += getGuid().hashCode();
		}
		if (getLanguage() != null) {
			_hashCode += getLanguage().hashCode();
		}
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		if (getDescriptionType() != null) {
			_hashCode += getDescriptionType().hashCode();
		}
		if (getPreferredBy() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPreferredBy()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPreferredBy(), i);
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
			IfdDescription.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdDescription"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guid");
		elemField.setXmlName(new javax.xml.namespace.QName("", "guid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("language");
		elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdLanguage"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("descriptionType");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"descriptionType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("preferredBy");
		elemField.setXmlName(new javax.xml.namespace.QName("", "preferredBy"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdOrganization"));
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
