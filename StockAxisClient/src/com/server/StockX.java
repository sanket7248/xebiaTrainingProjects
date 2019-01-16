/**
 * StockX.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.server;

public interface StockX extends java.rmi.Remote {
    public double getStockPrice(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.Boolean updateStock(java.lang.String arg0, double arg1) throws java.rmi.RemoteException;
}
