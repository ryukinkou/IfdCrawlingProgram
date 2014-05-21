/**
 * IfdChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdChange extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String concept_guid;

	private java.lang.Boolean concept;

	private java.lang.Boolean parents;

	private java.lang.Boolean children;

	public IfdChange() {
	}

	public IfdChange(java.lang.String concept_guid, java.lang.Boolean concept,
			java.lang.Boolean parents, java.lang.Boolean children) {
		this.concept_guid = concept_guid;
		this.concept = concept;
		this.parents = parents;
		this.children = children;
	}

	/**
	 * Gets the concept_guid value for this IfdChange.
	 * 
	 * @return concept_guid
	 */
	public java.lang.String getConcept_guid() {
		return concept_guid;
	}

	/**
	 * Sets the concept_guid value for this IfdChange.
	 * 
	 * @param concept_guid
	 */
	public void setConcept_guid(java.lang.String concept_guid) {
		this.concept_guid = concept_guid;
	}

	/**
	 * Gets the concept value for this IfdChange.
	 * 
	 * @return concept
	 */
	public java.lang.Boolean getConcept() {
		return concept;
	}

	/**
	 * Sets the concept value for this IfdChange.
	 * 
	 * @param concept
	 */
	public void setConcept(java.lang.Boolean concept) {
		this.concept = concept;
	}

	/**
	 * Gets the parents value for this IfdChange.
	 * 
	 * @return parents
	 */
	public java.lang.Boolean getParents() {
		return parents;
	}

	/**
	 * Sets the parents value for this IfdChange.
	 * 
	 * @param parents
	 */
	public void setParents(java.lang.Boolean parents) {
		this.parents = parents;
	}

	/**
	 * Gets the children value for this IfdChange.
	 * 
	 * @return children
	 */
	public java.lang.Boolean getChildren() {
		return children;
	}

	/**
	 * Sets the children value for this IfdChange.
	 * 
	 * @param children
	 */
	public void setChildren(java.lang.Boolean children) {
		this.children = children;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdChange))
			return false;
		IfdChange other = (IfdChange) obj;
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
				&& ((this.concept_guid == null && other.getConcept_guid() == null) || (this.concept_guid != null && this.concept_guid
						.equals(other.getConcept_guid())))
				&& ((this.concept == null && other.getConcept() == null) || (this.concept != null && this.concept
						.equals(other.getConcept())))
				&& ((this.parents == null && other.getParents() == null) || (this.parents != null && this.parents
						.equals(other.getParents())))
				&& ((this.children == null && other.getChildren() == null) || (this.children != null && this.children
						.equals(other.getChildren())));
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
		if (getConcept_guid() != null) {
			_hashCode += getConcept_guid().hashCode();
		}
		if (getConcept() != null) {
			_hashCode += getConcept().hashCode();
		}
		if (getParents() != null) {
			_hashCode += getParents().hashCode();
		}
		if (getChildren() != null) {
			_hashCode += getChildren().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			IfdChange.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdChange"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("concept_guid");
		elemField.setXmlName(new javax.xml.namespace.QName("", "concept_guid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("concept");
		elemField.setXmlName(new javax.xml.namespace.QName("", "concept"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parents");
		elemField.setXmlName(new javax.xml.namespace.QName("", "parents"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("children");
		elemField.setXmlName(new javax.xml.namespace.QName("", "children"));
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
