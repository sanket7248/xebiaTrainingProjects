/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.server;

public interface Account extends java.rmi.Remote {
    public java.lang.String getName(int accountNo) throws java.rmi.RemoteException;
    public java.lang.String readBalance(java.lang.String name) throws java.rmi.RemoteException;
}