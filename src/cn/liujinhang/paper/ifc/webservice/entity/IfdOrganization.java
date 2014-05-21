/**
 * IfdOrganization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdOrganization extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String guid;

	private java.lang.String name;

	private java.lang.String URL;

	public IfdOrganization() {
	}

	public IfdOrganization(java.lang.String guid, java.lang.String name,
			java.lang.String URL) {
		this.guid = guid;
		this.name = name;
		this.URL = URL;
	}

	/**
	 * Gets the guid value for this IfdOrganization.
	 * 
	 * @return guid
	 */
	public java.lang.String getGuid() {
		return guid;
	}

	/**
	 * Sets the guid value for this IfdOrganization.
	 * 
	 * @param guid
	 */
	public void setGuid(java.lang.String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the name value for this IfdOrganization.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this IfdOrganization.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the URL value for this IfdOrganization.
	 * 
	 * @return URL
	 */
	public java.lang.String getURL() {
		return URL;
	}

	/**
	 * Sets the URL value for this IfdOrganization.
	 * 
	 * @param URL
	 */
	public void setURL(java.lang.String URL) {
		this.URL = URL;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdOrganization))
			return false;
		IfdOrganization other = (IfdOrganization) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.URL == null && other.getURL() == null) || (this.URL != null && this.URL
						.equals(other.getURL())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getURL() != null) {
			_hashCode += getURL().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			IfdOrganization.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdOrganization"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guid");
		elemField.setXmlName(new javax.xml.namespace.QName("", "guid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
		elemField.setFieldName("URL");
		elemField.setXmlName(new javax.xml.namespace.QName("", "URL"));
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
