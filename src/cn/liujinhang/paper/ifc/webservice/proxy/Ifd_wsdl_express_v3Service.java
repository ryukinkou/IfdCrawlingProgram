/**
 * Ifd_wsdl_express_v3Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.liujinhang.paper.ifc.webservice.proxy;

public interface Ifd_wsdl_express_v3Service extends javax.xml.rpc.Service {
	public java.lang.String getEDMWSAddress();

	public cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3 getEDMWS()
			throws javax.xml.rpc.ServiceException;

	public cn.liujinhang.paper.ifc.webservice.proxy.Ifd_wsdl_express_v3 getEDMWS(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
