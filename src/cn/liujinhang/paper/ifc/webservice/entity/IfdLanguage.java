/**
 * IfdLanguage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdLanguage extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String guid;

	private java.lang.String nameInEnglish;

	private java.lang.String nameInSelf;

	private java.lang.String languageCode;

	public IfdLanguage() {
	}

	public IfdLanguage(java.lang.String guid, java.lang.String nameInEnglish,
			java.lang.String nameInSelf, java.lang.String languageCode) {
		this.guid = guid;
		this.nameInEnglish = nameInEnglish;
		this.nameInSelf = nameInSelf;
		this.languageCode = languageCode;
	}

	/**
	 * Gets the guid value for this IfdLanguage.
	 * 
	 * @return guid
	 */
	public java.lang.String getGuid() {
		return guid;
	}

	/**
	 * Sets the guid value for this IfdLanguage.
	 * 
	 * @param guid
	 */
	public void setGuid(java.lang.String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the nameInEnglish value for this IfdLanguage.
	 * 
	 * @return nameInEnglish
	 */
	public java.lang.String getNameInEnglish() {
		return nameInEnglish;
	}

	/**
	 * Sets the nameInEnglish value for this IfdLanguage.
	 * 
	 * @param nameInEnglish
	 */
	public void setNameInEnglish(java.lang.String nameInEnglish) {
		this.nameInEnglish = nameInEnglish;
	}

	/**
	 * Gets the nameInSelf value for this IfdLanguage.
	 * 
	 * @return nameInSelf
	 */
	public java.lang.String getNameInSelf() {
		return nameInSelf;
	}

	/**
	 * Sets the nameInSelf value for this IfdLanguage.
	 * 
	 * @param nameInSelf
	 */
	public void setNameInSelf(java.lang.String nameInSelf) {
		this.nameInSelf = nameInSelf;
	}

	/**
	 * Gets the languageCode value for this IfdLanguage.
	 * 
	 * @return languageCode
	 */
	public java.lang.String getLanguageCode() {
		return languageCode;
	}

	/**
	 * Sets the languageCode value for this IfdLanguage.
	 * 
	 * @param languageCode
	 */
	public void setLanguageCode(java.lang.String languageCode) {
		this.languageCode = languageCode;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdLanguage))
			return false;
		IfdLanguage other = (IfdLanguage) obj;
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
				&& ((this.nameInEnglish == null && other.getNameInEnglish() == null) || (this.nameInEnglish != null && this.nameInEnglish
						.equals(other.getNameInEnglish())))
				&& ((this.nameInSelf == null && other.getNameInSelf() == null) || (this.nameInSelf != null && this.nameInSelf
						.equals(other.getNameInSelf())))
				&& ((this.languageCode == null && other.getLanguageCode() == null) || (this.languageCode != null && this.languageCode
						.equals(other.getLanguageCode())));
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
		if (getNameInEnglish() != null) {
			_hashCode += getNameInEnglish().hashCode();
		}
		if (getNameInSelf() != null) {
			_hashCode += getNameInSelf().hashCode();
		}
		if (getLanguageCode() != null) {
			_hashCode += getLanguageCode().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			IfdLanguage.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdLanguage"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guid");
		elemField.setXmlName(new javax.xml.namespace.QName("", "guid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nameInEnglish");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "nameInEnglish"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nameInSelf");
		elemField.setXmlName(new javax.xml.namespace.QName("", "nameInSelf"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("languageCode");
		elemField.setXmlName(new javax.xml.namespace.QName("", "languageCode"));
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
