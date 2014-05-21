/**
 * IfdDelta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdDelta extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String search_criteria;

	private java.lang.String timestamp;

	private java.lang.String[] language_codes;

	private java.lang.String[] contextGuids;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] concepts;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] values;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] measures;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship[] relationships;

	public IfdDelta() {
	}

	public IfdDelta(
			java.lang.String search_criteria,
			java.lang.String timestamp,
			java.lang.String[] language_codes,
			java.lang.String[] contextGuids,
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] concepts,
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] values,
			cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] measures,
			cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship[] relationships) {
		this.search_criteria = search_criteria;
		this.timestamp = timestamp;
		this.language_codes = language_codes;
		this.contextGuids = contextGuids;
		this.concepts = concepts;
		this.values = values;
		this.measures = measures;
		this.relationships = relationships;
	}

	/**
	 * Gets the search_criteria value for this IfdDelta.
	 * 
	 * @return search_criteria
	 */
	public java.lang.String getSearch_criteria() {
		return search_criteria;
	}

	/**
	 * Sets the search_criteria value for this IfdDelta.
	 * 
	 * @param search_criteria
	 */
	public void setSearch_criteria(java.lang.String search_criteria) {
		this.search_criteria = search_criteria;
	}

	/**
	 * Gets the timestamp value for this IfdDelta.
	 * 
	 * @return timestamp
	 */
	public java.lang.String getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp value for this IfdDelta.
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(java.lang.String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Gets the language_codes value for this IfdDelta.
	 * 
	 * @return language_codes
	 */
	public java.lang.String[] getLanguage_codes() {
		return language_codes;
	}

	/**
	 * Sets the language_codes value for this IfdDelta.
	 * 
	 * @param language_codes
	 */
	public void setLanguage_codes(java.lang.String[] language_codes) {
		this.language_codes = language_codes;
	}

	/**
	 * Gets the contextGuids value for this IfdDelta.
	 * 
	 * @return contextGuids
	 */
	public java.lang.String[] getContextGuids() {
		return contextGuids;
	}

	/**
	 * Sets the contextGuids value for this IfdDelta.
	 * 
	 * @param contextGuids
	 */
	public void setContextGuids(java.lang.String[] contextGuids) {
		this.contextGuids = contextGuids;
	}

	/**
	 * Gets the concepts value for this IfdDelta.
	 * 
	 * @return concepts
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] getConcepts() {
		return concepts;
	}

	/**
	 * Sets the concepts value for this IfdDelta.
	 * 
	 * @param concepts
	 */
	public void setConcepts(
			cn.liujinhang.paper.ifc.webservice.entity.IfdConcept[] concepts) {
		this.concepts = concepts;
	}

	/**
	 * Gets the values value for this IfdDelta.
	 * 
	 * @return values
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] getValues() {
		return values;
	}

	/**
	 * Sets the values value for this IfdDelta.
	 * 
	 * @param values
	 */
	public void setValues(
			cn.liujinhang.paper.ifc.webservice.entity.IfdValue[] values) {
		this.values = values;
	}

	/**
	 * Gets the measures value for this IfdDelta.
	 * 
	 * @return measures
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] getMeasures() {
		return measures;
	}

	/**
	 * Sets the measures value for this IfdDelta.
	 * 
	 * @param measures
	 */
	public void setMeasures(
			cn.liujinhang.paper.ifc.webservice.entity.IfdMeasure[] measures) {
		this.measures = measures;
	}

	/**
	 * Gets the relationships value for this IfdDelta.
	 * 
	 * @return relationships
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship[] getRelationships() {
		return relationships;
	}

	/**
	 * Sets the relationships value for this IfdDelta.
	 * 
	 * @param relationships
	 */
	public void setRelationships(
			cn.liujinhang.paper.ifc.webservice.entity.IfdRelationship[] relationships) {
		this.relationships = relationships;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdDelta))
			return false;
		IfdDelta other = (IfdDelta) obj;
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
				&& ((this.search_criteria == null && other.getSearch_criteria() == null) || (this.search_criteria != null && this.search_criteria
						.equals(other.getSearch_criteria())))
				&& ((this.timestamp == null && other.getTimestamp() == null) || (this.timestamp != null && this.timestamp
						.equals(other.getTimestamp())))
				&& ((this.language_codes == null && other.getLanguage_codes() == null) || (this.language_codes != null && java.util.Arrays
						.equals(this.language_codes, other.getLanguage_codes())))
				&& ((this.contextGuids == null && other.getContextGuids() == null) || (this.contextGuids != null && java.util.Arrays
						.equals(this.contextGuids, other.getContextGuids())))
				&& ((this.concepts == null && other.getConcepts() == null) || (this.concepts != null && java.util.Arrays
						.equals(this.concepts, other.getConcepts())))
				&& ((this.values == null && other.getValues() == null) || (this.values != null && java.util.Arrays
						.equals(this.values, other.getValues())))
				&& ((this.measures == null && other.getMeasures() == null) || (this.measures != null && java.util.Arrays
						.equals(this.measures, other.getMeasures())))
				&& ((this.relationships == null && other.getRelationships() == null) || (this.relationships != null && java.util.Arrays
						.equals(this.relationships, other.getRelationships())));
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
		if (getSearch_criteria() != null) {
			_hashCode += getSearch_criteria().hashCode();
		}
		if (getTimestamp() != null) {
			_hashCode += getTimestamp().hashCode();
		}
		if (getLanguage_codes() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLanguage_codes()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLanguage_codes(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getContextGuids() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getContextGuids()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getContextGuids(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getConcepts() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getConcepts()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getConcepts(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
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
		if (getMeasures() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getMeasures()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getMeasures(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getRelationships() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getRelationships()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getRelationships(), i);
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
			IfdDelta.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdDelta"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("search_criteria");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"search_criteria"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("timestamp");
		elemField.setXmlName(new javax.xml.namespace.QName("", "timestamp"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("language_codes");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "language_codes"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("contextGuids");
		elemField.setXmlName(new javax.xml.namespace.QName("", "contextGuids"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("concepts");
		elemField.setXmlName(new javax.xml.namespace.QName("", "concepts"));
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
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("measures");
		elemField.setXmlName(new javax.xml.namespace.QName("", "measures"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdMeasure"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("relationships");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "relationships"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdRelationship"));
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
