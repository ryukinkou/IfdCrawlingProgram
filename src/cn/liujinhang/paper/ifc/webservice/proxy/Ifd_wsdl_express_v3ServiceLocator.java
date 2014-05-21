/**
 * Ifd_wsdl_express_v3ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.proxy;

public class Ifd_wsdl_express_v3ServiceLocator extends
		org.apache.axis.client.Service implements
		cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3Service {

	public Ifd_wsdl_express_v3ServiceLocator() {
	}

	public Ifd_wsdl_express_v3ServiceLocator(
			org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public Ifd_wsdl_express_v3ServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for EDMWS
	private java.lang.String EDMWS_address = "http://services.ifd-library.org/api/3.0/";

	public java.lang.String getEDMWSAddress() {
		return EDMWS_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String EDMWSWSDDServiceName = "EDMWS";

	public java.lang.String getEDMWSWSDDServiceName() {
		return EDMWSWSDDServiceName;
	}

	public void setEDMWSWSDDServiceName(java.lang.String name) {
		EDMWSWSDDServiceName = name;
	}

	public cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3 getEDMWS()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(EDMWS_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getEDMWS(endpoint);
	}

	public cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3 getEDMWS(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3BindingStub _stub = new cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3BindingStub(
					portAddress, this);
			_stub.setPortName(getEDMWSWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setEDMWSEndpointAddress(java.lang.String address) {
		EDMWS_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3.class
					.isAssignableFrom(serviceEndpointInterface)) {
				cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3BindingStub _stub = new cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3BindingStub(
						new java.net.URL(EDMWS_address), this);
				_stub.setPortName(getEDMWSWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException(
				"There is no stub implementation for the interface:  "
						+ (serviceEndpointInterface == null ? "null"
								: serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName,
			Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("EDMWS".equals(inputPortName)) {
			return getEDMWS();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName(
				"http://services.ifd-library.org/api/3.0/",
				"ifd_wsdl_express_v3Service");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://services.ifd-library.org/api/3.0/", "EDMWS"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("EDMWS".equals(portName)) {
			setEDMWSEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(
					" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
