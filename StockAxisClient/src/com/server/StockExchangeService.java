/**
 * StockExchangeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.server;

public interface StockExchangeService extends javax.xml.rpc.Service {
    public java.lang.String getStockExchangePortAddress();

    public com.server.StockX getStockExchangePort() throws javax.xml.rpc.ServiceException;

    public com.server.StockX getStockExchangePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
