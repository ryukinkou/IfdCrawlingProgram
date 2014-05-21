/**
 * IfdValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdValue extends
		cn.liujinhang.paper.ifc.webservice.entity.IfdConcept implements
		java.io.Serializable {
	private java.lang.String nominalValue;

	private java.lang.String upperTolerance;

	private java.lang.String lowerTolerance;

	private java.lang.String toleranceType;

	private java.lang.String valueType;

	public IfdValue() {
	}

	public IfdValue(
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
			cn.liujinhang.paper.ifc.webservice.entity.IfdOrganization owner,
			java.lang.String nominalValue, java.lang.String upperTolerance,
			java.lang.String lowerTolerance, java.lang.String toleranceType,
			java.lang.String valueType) {
		super(guid, versionId, versionDate, status, conceptType, fullNames,
				shortNames, lexemes, definitions, comments, illustrations,
				owner);
		this.nominalValue = nominalValue;
		this.upperTolerance = upperTolerance;
		this.lowerTolerance = lowerTolerance;
		this.toleranceType = toleranceType;
		this.valueType = valueType;
	}

	/**
	 * Gets the nominalValue value for this IfdValue.
	 * 
	 * @return nominalValue
	 */
	public java.lang.String getNominalValue() {
		return nominalValue;
	}

	/**
	 * Sets the nominalValue value for this IfdValue.
	 * 
	 * @param nominalValue
	 */
	public void setNominalValue(java.lang.String nominalValue) {
		this.nominalValue = nominalValue;
	}

	/**
	 * Gets the upperTolerance value for this IfdValue.
	 * 
	 * @return upperTolerance
	 */
	public java.lang.String getUpperTolerance() {
		return upperTolerance;
	}

	/**
	 * Sets the upperTolerance value for this IfdValue.
	 * 
	 * @param upperTolerance
	 */
	public void setUpperTolerance(java.lang.String upperTolerance) {
		this.upperTolerance = upperTolerance;
	}

	/**
	 * Gets the lowerTolerance value for this IfdValue.
	 * 
	 * @return lowerTolerance
	 */
	public java.lang.String getLowerTolerance() {
		return lowerTolerance;
	}

	/**
	 * Sets the lowerTolerance value for this IfdValue.
	 * 
	 * @param lowerTolerance
	 */
	public void setLowerTolerance(java.lang.String lowerTolerance) {
		this.lowerTolerance = lowerTolerance;
	}

	/**
	 * Gets the toleranceType value for this IfdValue.
	 * 
	 * @return toleranceType
	 */
	public java.lang.String getToleranceType() {
		return toleranceType;
	}

	/**
	 * Sets the toleranceType value for this IfdValue.
	 * 
	 * @param toleranceType
	 */
	public void setToleranceType(java.lang.String toleranceType) {
		this.toleranceType = toleranceType;
	}

	/**
	 * Gets the valueType value for this IfdValue.
	 * 
	 * @return valueType
	 */
	public java.lang.String getValueType() {
		return valueType;
	}

	/**
	 * Sets the valueType value for this IfdValue.
	 * 
	 * @param valueType
	 */
	public void setValueType(java.lang.String valueType) {
		this.valueType = valueType;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdValue))
			return false;
		IfdValue other = (IfdValue) obj;
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
				&& ((this.nominalValue == null && other.getNominalValue() == null) || (this.nominalValue != null && this.nominalValue
						.equals(other.getNominalValue())))
				&& ((this.upperTolerance == null && other.getUpperTolerance() == null) || (this.upperTolerance != null && this.upperTolerance
						.equals(other.getUpperTolerance())))
				&& ((this.lowerTolerance == null && other.getLowerTolerance() == null) || (this.lowerTolerance != null && this.lowerTolerance
						.equals(other.getLowerTolerance())))
				&& ((this.toleranceType == null && other.getToleranceType() == null) || (this.toleranceType != null && this.toleranceType
						.equals(other.getToleranceType())))
				&& ((this.valueType == null && other.getValueType() == null) || (this.valueType != null && this.valueType
						.equals(other.getValueType())));
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
		if (getNominalValue() != null) {
			_hashCode += getNominalValue().hashCode();
		}
		if (getUpperTolerance() != null) {
			_hashCode += getUpperTolerance().hashCode();
		}
		if (getLowerTolerance() != null) {
			_hashCode += getLowerTolerance().hashCode();
		}
		if (getToleranceType() != null) {
			_hashCode += getToleranceType().hashCode();
		}
		if (getValueType() != null) {
			_hashCode += getValueType().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			IfdValue.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdValue"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nominalValue");
		elemField.setXmlName(new javax.xml.namespace.QName("", "nominalValue"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("upperTolerance");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "upperTolerance"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lowerTolerance");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "lowerTolerance"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toleranceType");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "toleranceType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("valueType");
		elemField.setXmlName(new javax.xml.namespace.QName("", "valueType"));
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
