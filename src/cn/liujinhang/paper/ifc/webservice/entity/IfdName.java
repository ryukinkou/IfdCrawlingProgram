/**
 * IfdName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdName extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String guid;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage language;

	private java.lang.String name;

	private java.lang.String nameType;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] preferredBy;

	public IfdName() {
	}

	public IfdName(
			java.lang.String guid,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage language,
			java.lang.String name,
			java.lang.String nameType,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] preferredBy) {
		this.guid = guid;
		this.language = language;
		this.name = name;
		this.nameType = nameType;
		this.preferredBy = preferredBy;
	}

	/**
	 * Gets the guid value for this IfdName.
	 * 
	 * @return guid
	 */
	public java.lang.String getGuid() {
		return guid;
	}

	/**
	 * Sets the guid value for this IfdName.
	 * 
	 * @param guid
	 */
	public void setGuid(java.lang.String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the language value for this IfdName.
	 * 
	 * @return language
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage getLanguage() {
		return language;
	}

	/**
	 * Sets the language value for this IfdName.
	 * 
	 * @param language
	 */
	public void setLanguage(
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage language) {
		this.language = language;
	}

	/**
	 * Gets the name value for this IfdName.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this IfdName.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the nameType value for this IfdName.
	 * 
	 * @return nameType
	 */
	public java.lang.String getNameType() {
		return nameType;
	}

	/**
	 * Sets the nameType value for this IfdName.
	 * 
	 * @param nameType
	 */
	public void setNameType(java.lang.String nameType) {
		this.nameType = nameType;
	}

	/**
	 * Gets the preferredBy value for this IfdName.
	 * 
	 * @return preferredBy
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] getPreferredBy() {
		return preferredBy;
	}

	/**
	 * Sets the preferredBy value for this IfdName.
	 * 
	 * @param preferredBy
	 */
	public void setPreferredBy(
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] preferredBy) {
		this.preferredBy = preferredBy;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdName))
			return false;
		IfdName other = (IfdName) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.nameType == null && other.getNameType() == null) || (this.nameType != null && this.nameType
						.equals(other.getNameType())))
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getNameType() != null) {
			_hashCode += getNameType().hashCode();
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
			IfdName.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdName"));
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
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nameType");
		elemField.setXmlName(new javax.xml.namespace.QName("", "nameType"));
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
