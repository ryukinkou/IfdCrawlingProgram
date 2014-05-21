/**
 * IfdConflict.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdConflict extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String kind;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdConcept local_concept;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdConcept delta_concept;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdValue local_value;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdValue delta_value;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure local_measure;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure delta_measure;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship local_relationship;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship delta_relationship;

	private java.lang.Integer err_no;

	private java.lang.String comment;

	public IfdConflict() {
	}

	public IfdConflict(
			java.lang.String kind,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept local_concept,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept delta_concept,
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue local_value,
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue delta_value,
			cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure local_measure,
			cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure delta_measure,
			cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship local_relationship,
			cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship delta_relationship,
			java.lang.Integer err_no, java.lang.String comment) {
		this.kind = kind;
		this.local_concept = local_concept;
		this.delta_concept = delta_concept;
		this.local_value = local_value;
		this.delta_value = delta_value;
		this.local_measure = local_measure;
		this.delta_measure = delta_measure;
		this.local_relationship = local_relationship;
		this.delta_relationship = delta_relationship;
		this.err_no = err_no;
		this.comment = comment;
	}

	/**
	 * Gets the kind value for this IfdConflict.
	 * 
	 * @return kind
	 */
	public java.lang.String getKind() {
		return kind;
	}

	/**
	 * Sets the kind value for this IfdConflict.
	 * 
	 * @param kind
	 */
	public void setKind(java.lang.String kind) {
		this.kind = kind;
	}

	/**
	 * Gets the local_concept value for this IfdConflict.
	 * 
	 * @return local_concept
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept getLocal_concept() {
		return local_concept;
	}

	/**
	 * Sets the local_concept value for this IfdConflict.
	 * 
	 * @param local_concept
	 */
	public void setLocal_concept(
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept local_concept) {
		this.local_concept = local_concept;
	}

	/**
	 * Gets the delta_concept value for this IfdConflict.
	 * 
	 * @return delta_concept
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept getDelta_concept() {
		return delta_concept;
	}

	/**
	 * Sets the delta_concept value for this IfdConflict.
	 * 
	 * @param delta_concept
	 */
	public void setDelta_concept(
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept delta_concept) {
		this.delta_concept = delta_concept;
	}

	/**
	 * Gets the local_value value for this IfdConflict.
	 * 
	 * @return local_value
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdValue getLocal_value() {
		return local_value;
	}

	/**
	 * Sets the local_value value for this IfdConflict.
	 * 
	 * @param local_value
	 */
	public void setLocal_value(
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue local_value) {
		this.local_value = local_value;
	}

	/**
	 * Gets the delta_value value for this IfdConflict.
	 * 
	 * @return delta_value
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdValue getDelta_value() {
		return delta_value;
	}

	/**
	 * Sets the delta_value value for this IfdConflict.
	 * 
	 * @param delta_value
	 */
	public void setDelta_value(
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue delta_value) {
		this.delta_value = delta_value;
	}

	/**
	 * Gets the local_measure value for this IfdConflict.
	 * 
	 * @return local_measure
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure getLocal_measure() {
		return local_measure;
	}

	/**
	 * Sets the local_measure value for this IfdConflict.
	 * 
	 * @param local_measure
	 */
	public void setLocal_measure(
			cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure local_measure) {
		this.local_measure = local_measure;
	}

	/**
	 * Gets the delta_measure value for this IfdConflict.
	 * 
	 * @return delta_measure
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure getDelta_measure() {
		return delta_measure;
	}

	/**
	 * Sets the delta_measure value for this IfdConflict.
	 * 
	 * @param delta_measure
	 */
	public void setDelta_measure(
			cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure delta_measure) {
		this.delta_measure = delta_measure;
	}

	/**
	 * Gets the local_relationship value for this IfdConflict.
	 * 
	 * @return local_relationship
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship getLocal_relationship() {
		return local_relationship;
	}

	/**
	 * Sets the local_relationship value for this IfdConflict.
	 * 
	 * @param local_relationship
	 */
	public void setLocal_relationship(
			cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship local_relationship) {
		this.local_relationship = local_relationship;
	}

	/**
	 * Gets the delta_relationship value for this IfdConflict.
	 * 
	 * @return delta_relationship
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship getDelta_relationship() {
		return delta_relationship;
	}

	/**
	 * Sets the delta_relationship value for this IfdConflict.
	 * 
	 * @param delta_relationship
	 */
	public void setDelta_relationship(
			cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship delta_relationship) {
		this.delta_relationship = delta_relationship;
	}

	/**
	 * Gets the err_no value for this IfdConflict.
	 * 
	 * @return err_no
	 */
	public java.lang.Integer getErr_no() {
		return err_no;
	}

	/**
	 * Sets the err_no value for this IfdConflict.
	 * 
	 * @param err_no
	 */
	public void setErr_no(java.lang.Integer err_no) {
		this.err_no = err_no;
	}

	/**
	 * Gets the comment value for this IfdConflict.
	 * 
	 * @return comment
	 */
	public java.lang.String getComment() {
		return comment;
	}

	/**
	 * Sets the comment value for this IfdConflict.
	 * 
	 * @param comment
	 */
	public void setComment(java.lang.String comment) {
		this.comment = comment;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdConflict))
			return false;
		IfdConflict other = (IfdConflict) obj;
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
				&& ((this.kind == null && other.getKind() == null) || (this.kind != null && this.kind
						.equals(other.getKind())))
				&& ((this.local_concept == null && other.getLocal_concept() == null) || (this.local_concept != null && this.local_concept
						.equals(other.getLocal_concept())))
				&& ((this.delta_concept == null && other.getDelta_concept() == null) || (this.delta_concept != null && this.delta_concept
						.equals(other.getDelta_concept())))
				&& ((this.local_value == null && other.getLocal_value() == null) || (this.local_value != null && this.local_value
						.equals(other.getLocal_value())))
				&& ((this.delta_value == null && other.getDelta_value() == null) || (this.delta_value != null && this.delta_value
						.equals(other.getDelta_value())))
				&& ((this.local_measure == null && other.getLocal_measure() == null) || (this.local_measure != null && this.local_measure
						.equals(other.getLocal_measure())))
				&& ((this.delta_measure == null && other.getDelta_measure() == null) || (this.delta_measure != null && this.delta_measure
						.equals(other.getDelta_measure())))
				&& ((this.local_relationship == null && other
						.getLocal_relationship() == null) || (this.local_relationship != null && this.local_relationship
						.equals(other.getLocal_relationship())))
				&& ((this.delta_relationship == null && other
						.getDelta_relationship() == null) || (this.delta_relationship != null && this.delta_relationship
						.equals(other.getDelta_relationship())))
				&& ((this.err_no == null && other.getErr_no() == null) || (this.err_no != null && this.err_no
						.equals(other.getErr_no())))
				&& ((this.comment == null && other.getComment() == null) || (this.comment != null && this.comment
						.equals(other.getComment())));
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
		if (getKind() != null) {
			_hashCode += getKind().hashCode();
		}
		if (getLocal_concept() != null) {
			_hashCode += getLocal_concept().hashCode();
		}
		if (getDelta_concept() != null) {
			_hashCode += getDelta_concept().hashCode();
		}
		if (getLocal_value() != null) {
			_hashCode += getLocal_value().hashCode();
		}
		if (getDelta_value() != null) {
			_hashCode += getDelta_value().hashCode();
		}
		if (getLocal_measure() != null) {
			_hashCode += getLocal_measure().hashCode();
		}
		if (getDelta_measure() != null) {
			_hashCode += getDelta_measure().hashCode();
		}
		if (getLocal_relationship() != null) {
			_hashCode += getLocal_relationship().hashCode();
		}
		if (getDelta_relationship() != null) {
			_hashCode += getDelta_relationship().hashCode();
		}
		if (getErr_no() != null) {
			_hashCode += getErr_no().hashCode();
		}
		if (getComment() != null) {
			_hashCode += getComment().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			IfdConflict.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdConflict"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("kind");
		elemField.setXmlName(new javax.xml.namespace.QName("", "kind"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("local_concept");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "local_concept"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdConcept"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("delta_concept");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "delta_concept"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdConcept"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("local_value");
		elemField.setXmlName(new javax.xml.namespace.QName("", "local_value"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdValue"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("delta_value");
		elemField.setXmlName(new javax.xml.namespace.QName("", "delta_value"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdValue"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("local_measure");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "local_measure"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdMeasure"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("delta_measure");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "delta_measure"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdMeasure"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("local_relationship");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"local_relationship"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdRelationship"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("delta_relationship");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"delta_relationship"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdRelationship"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("err_no");
		elemField.setXmlName(new javax.xml.namespace.QName("", "err_no"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("comment");
		elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
