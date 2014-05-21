/**
 * IfdConcept.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdConcept extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String guid;

	private java.lang.String versionId;

	private java.lang.String versionDate;

	private java.lang.String status;

	private java.lang.String conceptType;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdName[] fullNames;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdName[] shortNames;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdName[] lexemes;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] definitions;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] comments;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[] illustrations;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization owner;

	public IfdConcept() {
	}

	public IfdConcept(
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
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization owner) {
		this.guid = guid;
		this.versionId = versionId;
		this.versionDate = versionDate;
		this.status = status;
		this.conceptType = conceptType;
		this.fullNames = fullNames;
		this.shortNames = shortNames;
		this.lexemes = lexemes;
		this.definitions = definitions;
		this.comments = comments;
		this.illustrations = illustrations;
		this.owner = owner;
	}

	/**
	 * Gets the guid value for this IfdConcept.
	 * 
	 * @return guid
	 */
	public java.lang.String getGuid() {
		return guid;
	}

	/**
	 * Sets the guid value for this IfdConcept.
	 * 
	 * @param guid
	 */
	public void setGuid(java.lang.String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the versionId value for this IfdConcept.
	 * 
	 * @return versionId
	 */
	public java.lang.String getVersionId() {
		return versionId;
	}

	/**
	 * Sets the versionId value for this IfdConcept.
	 * 
	 * @param versionId
	 */
	public void setVersionId(java.lang.String versionId) {
		this.versionId = versionId;
	}

	/**
	 * Gets the versionDate value for this IfdConcept.
	 * 
	 * @return versionDate
	 */
	public java.lang.String getVersionDate() {
		return versionDate;
	}

	/**
	 * Sets the versionDate value for this IfdConcept.
	 * 
	 * @param versionDate
	 */
	public void setVersionDate(java.lang.String versionDate) {
		this.versionDate = versionDate;
	}

	/**
	 * Gets the status value for this IfdConcept.
	 * 
	 * @return status
	 */
	public java.lang.String getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this IfdConcept.
	 * 
	 * @param status
	 */
	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	/**
	 * Gets the conceptType value for this IfdConcept.
	 * 
	 * @return conceptType
	 */
	public java.lang.String getConceptType() {
		return conceptType;
	}

	/**
	 * Sets the conceptType value for this IfdConcept.
	 * 
	 * @param conceptType
	 */
	public void setConceptType(java.lang.String conceptType) {
		this.conceptType = conceptType;
	}

	/**
	 * Gets the fullNames value for this IfdConcept.
	 * 
	 * @return fullNames
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] getFullNames() {
		return fullNames;
	}

	/**
	 * Sets the fullNames value for this IfdConcept.
	 * 
	 * @param fullNames
	 */
	public void setFullNames(
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] fullNames) {
		this.fullNames = fullNames;
	}

	/**
	 * Gets the shortNames value for this IfdConcept.
	 * 
	 * @return shortNames
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] getShortNames() {
		return shortNames;
	}

	/**
	 * Sets the shortNames value for this IfdConcept.
	 * 
	 * @param shortNames
	 */
	public void setShortNames(
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] shortNames) {
		this.shortNames = shortNames;
	}

	/**
	 * Gets the lexemes value for this IfdConcept.
	 * 
	 * @return lexemes
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdName[] getLexemes() {
		return lexemes;
	}

	/**
	 * Sets the lexemes value for this IfdConcept.
	 * 
	 * @param lexemes
	 */
	public void setLexemes(
			cn.liujinhang.paper.ifc.webservice.entity.IfdName[] lexemes) {
		this.lexemes = lexemes;
	}

	/**
	 * Gets the definitions value for this IfdConcept.
	 * 
	 * @return definitions
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] getDefinitions() {
		return definitions;
	}

	/**
	 * Sets the definitions value for this IfdConcept.
	 * 
	 * @param definitions
	 */
	public void setDefinitions(
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] definitions) {
		this.definitions = definitions;
	}

	/**
	 * Gets the comments value for this IfdConcept.
	 * 
	 * @return comments
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] getComments() {
		return comments;
	}

	/**
	 * Sets the comments value for this IfdConcept.
	 * 
	 * @param comments
	 */
	public void setComments(
			cn.liujinhang.paper.ifc.webservice.entity.IfdDescription[] comments) {
		this.comments = comments;
	}

	/**
	 * Gets the illustrations value for this IfdConcept.
	 * 
	 * @return illustrations
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[] getIllustrations() {
		return illustrations;
	}

	/**
	 * Sets the illustrations value for this IfdConcept.
	 * 
	 * @param illustrations
	 */
	public void setIllustrations(
			cn.liujinhang.paper.ifc.webservice.entity.IfdIllustration[] illustrations) {
		this.illustrations = illustrations;
	}

	/**
	 * Gets the owner value for this IfdConcept.
	 * 
	 * @return owner
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization getOwner() {
		return owner;
	}

	/**
	 * Sets the owner value for this IfdConcept.
	 * 
	 * @param owner
	 */
	public void setOwner(
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization owner) {
		this.owner = owner;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdConcept))
			return false;
		IfdConcept other = (IfdConcept) obj;
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
				&& ((this.conceptType == null && other.getConceptType() == null) || (this.conceptType != null && this.conceptType
						.equals(other.getConceptType())))
				&& ((this.fullNames == null && other.getFullNames() == null) || (this.fullNames != null && java.util.Arrays
						.equals(this.fullNames, other.getFullNames())))
				&& ((this.shortNames == null && other.getShortNames() == null) || (this.shortNames != null && java.util.Arrays
						.equals(this.shortNames, other.getShortNames())))
				&& ((this.lexemes == null && other.getLexemes() == null) || (this.lexemes != null && java.util.Arrays
						.equals(this.lexemes, other.getLexemes())))
				&& ((this.definitions == null && other.getDefinitions() == null) || (this.definitions != null && java.util.Arrays
						.equals(this.definitions, other.getDefinitions())))
				&& ((this.comments == null && other.getComments() == null) || (this.comments != null && java.util.Arrays
						.equals(this.comments, other.getComments())))
				&& ((this.illustrations == null && other.getIllustrations() == null) || (this.illustrations != null && java.util.Arrays
						.equals(this.illustrations, other.getIllustrations())))
				&& ((this.owner == null && other.getOwner() == null) || (this.owner != null && this.owner
						.equals(other.getOwner())));
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
		if (getConceptType() != null) {
			_hashCode += getConceptType().hashCode();
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
		if (getShortNames() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getShortNames()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getShortNames(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getLexemes() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getLexemes()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLexemes(), i);
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
		if (getIllustrations() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getIllustrations()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getIllustrations(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getOwner() != null) {
			_hashCode += getOwner().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			IfdConcept.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConcept"));
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
		elemField.setFieldName("conceptType");
		elemField.setXmlName(new javax.xml.namespace.QName("", "conceptType"));
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
		elemField.setFieldName("shortNames");
		elemField.setXmlName(new javax.xml.namespace.QName("", "shortNames"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdName"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lexemes");
		elemField.setXmlName(new javax.xml.namespace.QName("", "lexemes"));
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
		elemField.setFieldName("illustrations");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "illustrations"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdIllustration"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("owner");
		elemField.setXmlName(new javax.xml.namespace.QName("", "owner"));
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
