/**
 * IfdContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdContext extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String guid;

	private java.lang.String versionId;

	private java.lang.String versionDate;

	private java.lang.String status;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdName[] fullNames;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] definitions;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] comments;

	private java.lang.Boolean restricted;

	private java.lang.Boolean readOnly;

	public IfdContext() {
	}

	public IfdContext(
			java.lang.String guid,
			java.lang.String versionId,
			java.lang.String versionDate,
			java.lang.String status,
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] fullNames,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] definitions,
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] comments,
			java.lang.Boolean restricted, java.lang.Boolean readOnly) {
		this.guid = guid;
		this.versionId = versionId;
		this.versionDate = versionDate;
		this.status = status;
		this.fullNames = fullNames;
		this.definitions = definitions;
		this.comments = comments;
		this.restricted = restricted;
		this.readOnly = readOnly;
	}

	/**
	 * Gets the guid value for this IfdContext.
	 * 
	 * @return guid
	 */
	public java.lang.String getGuid() {
		return guid;
	}

	/**
	 * Sets the guid value for this IfdContext.
	 * 
	 * @param guid
	 */
	public void setGuid(java.lang.String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the versionId value for this IfdContext.
	 * 
	 * @return versionId
	 */
	public java.lang.String getVersionId() {
		return versionId;
	}

	/**
	 * Sets the versionId value for this IfdContext.
	 * 
	 * @param versionId
	 */
	public void setVersionId(java.lang.String versionId) {
		this.versionId = versionId;
	}

	/**
	 * Gets the versionDate value for this IfdContext.
	 * 
	 * @return versionDate
	 */
	public java.lang.String getVersionDate() {
		return versionDate;
	}

	/**
	 * Sets the versionDate value for this IfdContext.
	 * 
	 * @param versionDate
	 */
	public void setVersionDate(java.lang.String versionDate) {
		this.versionDate = versionDate;
	}

	/**
	 * Gets the status value for this IfdContext.
	 * 
	 * @return status
	 */
	public java.lang.String getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this IfdContext.
	 * 
	 * @param status
	 */
	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	/**
	 * Gets the fullNames value for this IfdContext.
	 * 
	 * @return fullNames
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] getFullNames() {
		return fullNames;
	}

	/**
	 * Sets the fullNames value for this IfdContext.
	 * 
	 * @param fullNames
	 */
	public void setFullNames(
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] fullNames) {
		this.fullNames = fullNames;
	}

	/**
	 * Gets the definitions value for this IfdContext.
	 * 
	 * @return definitions
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] getDefinitions() {
		return definitions;
	}

	/**
	 * Sets the definitions value for this IfdContext.
	 * 
	 * @param definitions
	 */
	public void setDefinitions(
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] definitions) {
		this.definitions = definitions;
	}

	/**
	 * Gets the comments value for this IfdContext.
	 * 
	 * @return comments
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] getComments() {
		return comments;
	}

	/**
	 * Sets the comments value for this IfdContext.
	 * 
	 * @param comments
	 */
	public void setComments(
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] comments) {
		this.comments = comments;
	}

	/**
	 * Gets the restricted value for this IfdContext.
	 * 
	 * @return restricted
	 */
	public java.lang.Boolean getRestricted() {
		return restricted;
	}

	/**
	 * Sets the restricted value for this IfdContext.
	 * 
	 * @param restricted
	 */
	public void setRestricted(java.lang.Boolean restricted) {
		this.restricted = restricted;
	}

	/**
	 * Gets the readOnly value for this IfdContext.
	 * 
	 * @return readOnly
	 */
	public java.lang.Boolean getReadOnly() {
		return readOnly;
	}

	/**
	 * Sets the readOnly value for this IfdContext.
	 * 
	 * @param readOnly
	 */
	public void setReadOnly(java.lang.Boolean readOnly) {
		this.readOnly = readOnly;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdContext))
			return false;
		IfdContext other = (IfdContext) obj;
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
				&& ((this.versionId == null && other.getVersionId() == null) || (this.versionId != null && this.versionId
						.equals(other.getVersionId())))
				&& ((this.versionDate == null && other.getVersionDate() == null) || (this.versionDate != null && this.versionDate
						.equals(other.getVersionDate())))
				&& ((this.status == null && other.getStatus() == null) || (this.status != null && this.status
						.equals(other.getStatus())))
				&& ((this.fullNames == null && other.getFullNames() == null) || (this.fullNames != null && java.util.Arrays
						.equals(this.fullNames, other.getFullNames())))
				&& ((this.definitions == null && other.getDefinitions() == null) || (this.definitions != null && java.util.Arrays
						.equals(this.definitions, other.getDefinitions())))
				&& ((this.comments == null && other.getComments() == null) || (this.comments != null && java.util.Arrays
						.equals(this.comments, other.getComments())))
				&& ((this.restricted == null && other.getRestricted() == null) || (this.restricted != null && this.restricted
						.equals(other.getRestricted())))
				&& ((this.readOnly == null && other.getReadOnly() == null) || (this.readOnly != null && this.readOnly
						.equals(other.getReadOnly())));
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
		if (getVersionId() != null) {
			_hashCode += getVersionId().hashCode();
		}
		if (getVersionDate() != null) {
			_hashCode += getVersionDate().hashCode();
		}
		if (getStatus() != null) {
			_hashCode += getStatus().hashCode();
		}
		if (getFullNames() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getFullNames()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getFullNames(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDefinitions() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDefinitions()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDefinitions(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getComments() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getComments()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getComments(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getRestricted() != null) {
			_hashCode += getRestricted().hashCode();
		}
		if (getReadOnly() != null) {
			_hashCode += getReadOnly().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			IfdContext.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdContext"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guid");
		elemField.setXmlName(new javax.xml.namespace.QName("", "guid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("versionId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "versionId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("versionDate");
		elemField.setXmlName(new javax.xml.namespace.QName("", "versionDate"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fullNames");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fullNames"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdName"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("definitions");
		elemField.setXmlName(new javax.xml.namespace.QName("", "definitions"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdDescription"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("comments");
		elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdDescription"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("restricted");
		elemField.setXmlName(new javax.xml.namespace.QName("", "restricted"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("readOnly");
		elemField.setXmlName(new javax.xml.namespace.QName("", "readOnly"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
