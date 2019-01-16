/**
 * BankSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bank;

public class BankSoapBindingSkeleton implements com.bank.BankPort, org.apache.axis.wsdl.Skeleton {
    private com.bank.BankPort impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://bank.com", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("readUserFromAccounts", _params, new javax.xml.namespace.QName("http://bank.com", "readUserFromAccountsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://bank.com", "User"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://bank.com", "readUserFromAccounts"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("readUserFromAccounts") == null) {
            _myOperations.put("readUserFromAccounts", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("readUserFromAccounts")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://bank.com", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bank.com", "User"), com.bank.User.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getLocationForUser", _params, new javax.xml.namespace.QName("http://bank.com", "getLocationForUserReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://bank.com", "Address"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://bank.com", "getLocationForUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getLocationForUser") == null) {
            _myOperations.put("getLocationForUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getLocationForUser")).add(_oper);
    }

    public BankSoapBindingSkeleton() {
        this.impl = new com.bank.BankSoapBindingImpl();
    }

    public BankSoapBindingSkeleton(com.bank.BankPort impl) {
        this.impl = impl;
    }
    public com.bank.User readUserFromAccounts(int userId) throws java.rmi.RemoteException
    {
        com.bank.User ret = impl.readUserFromAccounts(userId);
        return ret;
    }

    public com.bank.Address getLocationForUser(com.bank.User user) throws java.rmi.RemoteException
    {
        com.bank.Address ret = impl.getLocationForUser(user);
        return ret;
    }

}
