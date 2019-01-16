/**
 * BankSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bank;

public class BankSoapBindingImpl implements com.bank.BankPort{
    public com.bank.User readUserFromAccounts(int userId) throws java.rmi.RemoteException {
    	User user =new User();
    	Address add=new Address();
    	add.setAreaCode(23123);
    	add.setLocation("sdfsdfsdf");
    	add.setNum(345345);
    	user.setAddress(add);
    	user.setIncome(34534545);
    	user.setSecCode("45456");
    	user.setUserId(345345);
        return user;
    }

    public com.bank.Address getLocationForUser(com.bank.User user) throws java.rmi.RemoteException {
    	Address add=new Address();
    	add.setAreaCode(23123);
    	add.setLocation("sdfsdfsdf");
    	add.setNum(345345);
        return add;
    }

}
