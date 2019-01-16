/**
 * StockExchangeServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.server;

public class StockExchangeServiceLocator extends org.apache.axis.client.Service implements com.server.StockExchangeService {

    public StockExchangeServiceLocator() {
    }


    public StockExchangeServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StockExchangeServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StockExchangePort
    private java.lang.String StockExchangePort_address = "http://localhost:8080/StocksModule/services/StockExchangePort";

    public java.lang.String getStockExchangePortAddress() {
        return StockExchangePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StockExchangePortWSDDServiceName = "StockExchangePort";

    public java.lang.String getStockExchangePortWSDDServiceName() {
        return StockExchangePortWSDDServiceName;
    }

    public void setStockExchangePortWSDDServiceName(java.lang.String name) {
        StockExchangePortWSDDServiceName = name;
    }

    public com.server.StockX getStockExchangePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StockExchangePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStockExchangePort(endpoint);
    }

    public com.server.StockX getStockExchangePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.server.StockExchangeServiceSoapBindingStub _stub = new com.server.StockExchangeServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getStockExchangePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStockExchangePortEndpointAddress(java.lang.String address) {
        StockExchangePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.server.StockX.class.isAssignableFrom(serviceEndpointInterface)) {
                com.server.StockExchangeServiceSoapBindingStub _stub = new com.server.StockExchangeServiceSoapBindingStub(new java.net.URL(StockExchangePort_address), this);
                _stub.setPortName(getStockExchangePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StockExchangePort".equals(inputPortName)) {
            return getStockExchangePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server.com/", "StockExchangeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server.com/", "StockExchangePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StockExchangePort".equals(portName)) {
            setStockExchangePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
