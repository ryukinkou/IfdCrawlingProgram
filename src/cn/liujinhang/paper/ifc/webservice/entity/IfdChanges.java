/**
 * IfdChanges.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.entity;

public class IfdChanges extends
		cn.liujinhang.paper.ifc.webservice.entity.EDMbaseEntity implements
		java.io.Serializable {
	private java.lang.String timestamp;

	private cn.liujinhang.paper.ifc.webservice.entity.IfdChange[] changes;

	public IfdChanges() {
	}

	public IfdChanges(java.lang.String timestamp,
			cn.liujinhang.paper.ifc.webservice.entity.IfdChange[] changes) {
		this.timestamp = timestamp;
		this.changes = changes;
	}

	/**
	 * Gets the timestamp value for this IfdChanges.
	 * 
	 * @return timestamp
	 */
	public java.lang.String getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp value for this IfdChanges.
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(java.lang.String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Gets the changes value for this IfdChanges.
	 * 
	 * @return changes
	 */
	public cn.liujinhang.paper.ifc.webservice.entity.IfdChange[] getChanges() {
		return changes;
	}

	/**
	 * Sets the changes value for this IfdChanges.
	 * 
	 * @param changes
	 */
	public void setChanges(
			cn.liujinhang.paper.ifc.webservice.entity.IfdChange[] changes) {
		this.changes = changes;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IfdChanges))
			return false;
		IfdChanges other = (IfdChanges) obj;
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
				&& ((this.timestamp == null && other.getTimestamp() == null) || (this.timestamp != null && this.timestamp
						.equals(other.getTimestamp())))
				&& ((this.changes == null && other.getChanges() == null) || (this.changes != null && java.util.Arrays
						.equals(this.changes, other.getChanges())));
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
		if (getTimestamp() != null) {
			_hashCode += getTimestamp().hashCode();
		}
		if (getChanges() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getChanges()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getChanges(), i);
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
			IfdChanges.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
				"IfdChanges"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("timestamp");
		elemField.setXmlName(new javax.xml.namespace.QName("", "timestamp"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("changes");
		elemField.setXmlName(new javax.xml.namespace.QName("", "changes"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://epmtech.jotne.com/IFD_API_IMPLEMENTATION_V3/ifd_wsdl_express_v3",
						"IfdChange"));
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
