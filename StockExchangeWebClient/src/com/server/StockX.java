package com.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-15T15:50:21.926+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://server.com/", name = "StockX")
@XmlSeeAlso({ObjectFactory.class})
public interface StockX {

    @WebMethod
    @RequestWrapper(localName = "getStockPrice", targetNamespace = "http://server.com/", className = "com.server.GetStockPrice")
    @ResponseWrapper(localName = "getStockPriceResponse", targetNamespace = "http://server.com/", className = "com.server.GetStockPriceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public double getStockPrice(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "removeStock", targetNamespace = "http://server.com/", className = "com.server.RemoveStock")
    @ResponseWrapper(localName = "removeStockResponse", targetNamespace = "http://server.com/", className = "com.server.RemoveStockResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean removeStock(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "updateStock", targetNamespace = "http://server.com/", className = "com.server.UpdateStock")
    @ResponseWrapper(localName = "updateStockResponse", targetNamespace = "http://server.com/", className = "com.server.UpdateStockResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.Boolean updateStock(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1
    );
}
