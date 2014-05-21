/**
 * IfdUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdUser extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String guid;

	private java.lang.String name;

	private java.lang.String email;

	private java.lang.String createdDate;

	private java.lang.String role;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization memberOf;

	public IfdUser() {
	}

	public IfdUser(java.lang.String guid, java.lang.String name,
			java.lang.String email, java.lang.String createdDate,
			java.lang.String role,
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization memberOf) {
		this.guid = guid;
		this.name = name;
		this.email = email;
		this.createdDate = createdDate;
		this.role = role;
		this.memberOf = memberOf;
	}

	/**
	 * Gets the guid value for this IfdUser.
	 * 
	 * @return guid
	 */
	public java.lang.String getGuid() {
		return guid;
	}

	/**
	 * Sets the guid value for this IfdUser.
	 * 
	 * @param guid
	 */
	public void setGuid(java.lang.String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the name value for this IfdUser.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this IfdUser.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the email value for this IfdUser.
	 * 
	 * @return email
	 */
	public java.lang.String getEmail() {
		return email;
	}

	/**
	 * Sets the email value for this IfdUser.
	 * 
	 * @param email
	 */
	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	/**
	 * Gets the createdDate value for this IfdUser.
	 * 
	 * @return createdDate
	 */
	public java.lang.String getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the createdDate value for this IfdUser.
	 * 
	 * @param createdDate
	 */
	public void setCreatedDate(java.lang.String createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the role value for this IfdUser.
	 * 
	 * @return role
	 */
	public java.lang.String getRole() {
		return role;
	}

	/**
	 * Sets the role value for this IfdUser.
	 * 
	 * @param role
	 */
	public void setRole(java.lang.String role) {
		this.role = role;
	}

	/**
	 * Gets the memberOf value for this IfdUser.
	 * 
	 * @return memberOf
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization getMemberOf() {
		return memberOf;
	}

	/**
	 * Sets the memberOf value for this IfdUser.
	 * 
	 * @param memberOf
	 */
	public void setMemberOf(
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization memberOf) {
		this.memberOf = memberOf;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdUser))
			return false;
		IfdUser other = (IfdUser) obj;
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
				&& ((this.email == null && other.getEmail() == null) || (this.email != null && this.email
						.equals(other.getEmail())))
				&& ((this.createdDate == null && other.getCreatedDate() == null) || (this.createdDate != null && this.createdDate
						.equals(other.getCreatedDate())))
				&& ((this.role == null && other.getRole() == null) || (this.role != null && this.role
						.equals(other.getRole())))
				&& ((this.memberOf == null && other.getMemberOf() == null) || (this.memberOf != null && this.memberOf
						.equals(other.getMemberOf())));
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
		if (getEmail() != null) {
			_hashCode += getEmail().hashCode();
		}
		if (getCreatedDate() != null) {
			_hashCode += getCreatedDate().hashCode();
		}
		if (getRole() != null) {
			_hashCode += getRole().hashCode();
		}
		if (getMemberOf() != null) {
			_hashCode += getMemberOf().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			IfdUser.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdUser"));
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
		elemField.setFieldName("email");
		elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("createdDate");
		elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("role");
		elemField.setXmlName(new javax.xml.namespace.QName("", "role"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memberOf");
		elemField.setXmlName(new javax.xml.namespace.QName("", "memberOf"));
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
