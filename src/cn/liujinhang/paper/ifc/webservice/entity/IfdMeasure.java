/**
 * IfdMeasure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdMeasure extends
		cn.liujinhang.paper.ifc.webservice.entity.IfdConcept implements
		java.io.Serializable {
	private cn.liujinhang.paper.ifc.webservice.entity.IfdConcept unit;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] values;

	public IfdMeasure() {
	}

	public IfdMeasure(
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
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept unit,
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] values) {
		super(guid, versionId, versionDate, status, conceptType, fullNames,
				shortNames, lexemes, definitions, comments, illustrations,
				owner);
		this.unit = unit;
		this.values = values;
	}

	/**
	 * Gets the unit value for this IfdMeasure.
	 * 
	 * @return unit
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept getUnit() {
		return unit;
	}

	/**
	 * Sets the unit value for this IfdMeasure.
	 * 
	 * @param unit
	 */
	public void setUnit(
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept unit) {
		this.unit = unit;
	}

	/**
	 * Gets the values value for this IfdMeasure.
	 * 
	 * @return values
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] getValues() {
		return values;
	}

	/**
	 * Sets the values value for this IfdMeasure.
	 * 
	 * @param values
	 */
	public void setValues(
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] values) {
		this.values = values;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdMeasure))
			return false;
		IfdMeasure other = (IfdMeasure) obj;
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
				&& ((this.unit == null && other.getUnit() == null) || (this.unit != null && this.unit
						.equals(other.getUnit())))
				&& ((this.values == null && other.getValues() == null) || (this.values != null && java.util.Arrays
						.equals(this.values, other.getValues())));
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
		if (getUnit() != null) {
			_hashCode += getUnit().hashCode();
		}
		if (getValues() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getValues()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getValues(),
						i);
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
			IfdMeasure.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdMeasure"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("unit");
		elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdConcept"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("values");
		elemField.setXmlName(new javax.xml.namespace.QName("", "values"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdValue"));
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
