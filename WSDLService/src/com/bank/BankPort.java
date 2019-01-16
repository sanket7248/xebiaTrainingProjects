/**
 * BankPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bank;

public interface BankPort extends java.rmi.Remote {
    public com.bank.User readUserFromAccounts(int userId) throws java.rmi.RemoteException;
    public com.bank.Address getLocationForUser(com.bank.User user) throws java.rmi.RemoteException;
}
