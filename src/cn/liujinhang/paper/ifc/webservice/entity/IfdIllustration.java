/**
 * IfdIllustration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdIllustration extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String guid;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage language;

	private java.lang.String mimetype;

	private java.lang.String illustration;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] preferredBy;

	public IfdIllustration() {
	}

	public IfdIllustration(
			java.lang.String guid,
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage language,
			java.lang.String mimetype,
			java.lang.String illustration,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] preferredBy) {
		this.guid = guid;
		this.language = language;
		this.mimetype = mimetype;
		this.illustration = illustration;
		this.preferredBy = preferredBy;
	}

	/**
	 * Gets the guid value for this IfdIllustration.
	 * 
	 * @return guid
	 */
	public java.lang.String getGuid() {
		return guid;
	}

	/**
	 * Sets the guid value for this IfdIllustration.
	 * 
	 * @param guid
	 */
	public void setGuid(java.lang.String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the language value for this IfdIllustration.
	 * 
	 * @return language
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage getLanguage() {
		return language;
	}

	/**
	 * Sets the language value for this IfdIllustration.
	 * 
	 * @param language
	 */
	public void setLanguage(
			cn.liujinhang.paper.ifc.webservice.entity.IfdLanguage language) {
		this.language = language;
	}

	/**
	 * Gets the mimetype value for this IfdIllustration.
	 * 
	 * @return mimetype
	 */
	public java.lang.String getMimetype() {
		return mimetype;
	}

	/**
	 * Sets the mimetype value for this IfdIllustration.
	 * 
	 * @param mimetype
	 */
	public void setMimetype(java.lang.String mimetype) {
		this.mimetype = mimetype;
	}

	/**
	 * Gets the illustration value for this IfdIllustration.
	 * 
	 * @return illustration
	 */
	public java.lang.String getIllustration() {
		return illustration;
	}

	/**
	 * Sets the illustration value for this IfdIllustration.
	 * 
	 * @param illustration
	 */
	public void setIllustration(java.lang.String illustration) {
		this.illustration = illustration;
	}

	/**
	 * Gets the preferredBy value for this IfdIllustration.
	 * 
	 * @return preferredBy
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] getPreferredBy() {
		return preferredBy;
	}

	/**
	 * Sets the preferredBy value for this IfdIllustration.
	 * 
	 * @param preferredBy
	 */
	public void setPreferredBy(
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization[] preferredBy) {
		this.preferredBy = preferredBy;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdIllustration))
			return false;
		IfdIllustration other = (IfdIllustration) obj;
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
				&& ((this.mimetype == null && other.getMimetype() == null) || (this.mimetype != null && this.mimetype
						.equals(other.getMimetype())))
				&& ((this.illustration == null && other.getIllustration() == null) || (this.illustration != null && this.illustration
						.equals(other.getIllustration())))
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
		if (getMimetype() != null) {
			_hashCode += getMimetype().hashCode();
		}
		if (getIllustration() != null) {
			_hashCode += getIllustration().hashCode();
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
			IfdIllustration.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdIllustration"));
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
		elemField.setFieldName("mimetype");
		elemField.setXmlName(new javax.xml.namespace.QName("", "mimetype"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("illustration");
		elemField.setXmlName(new javax.xml.namespace.QName("", "illustration"));
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
