/**
 * AccountServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.server;

public class AccountServiceLocator extends org.apache.axis.client.Service implements com.server.AccountService {

    public AccountServiceLocator() {
    }


    public AccountServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AccountServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AccountPort
    private java.lang.String AccountPort_address = "http://localhost:8080/CXF-Service/services/AccountPort";

    public java.lang.String getAccountPortAddress() {
        return AccountPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AccountPortWSDDServiceName = "AccountPort";

    public java.lang.String getAccountPortWSDDServiceName() {
        return AccountPortWSDDServiceName;
    }

    public void setAccountPortWSDDServiceName(java.lang.String name) {
        AccountPortWSDDServiceName = name;
    }

    public com.server.AccountSEI getAccountPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AccountPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAccountPort(endpoint);
    }

    public com.server.AccountSEI getAccountPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.server.AccountServiceSoapBindingStub _stub = new com.server.AccountServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAccountPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAccountPortEndpointAddress(java.lang.String address) {
        AccountPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.server.AccountSEI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.server.AccountServiceSoapBindingStub _stub = new com.server.AccountServiceSoapBindingStub(new java.net.URL(AccountPort_address), this);
                _stub.setPortName(getAccountPortWSDDServiceName());
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
        if ("AccountPort".equals(inputPortName)) {
            return getAccountPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server.com/", "AccountService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server.com/", "AccountPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AccountPort".equals(portName)) {
            setAccountPortEndpointAddress(address);
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
