package com.server;

public class StockXProxy implements com.server.StockX {
  private String _endpoint = null;
  private com.server.StockX stockX = null;
  
  public StockXProxy() {
    _initStockXProxy();
  }
  
  public StockXProxy(String endpoint) {
    _endpoint = endpoint;
    _initStockXProxy();
  }
  
  private void _initStockXProxy() {
    try {
      stockX = (new com.server.StockExchangeServiceLocator()).getStockExchangePort();
      if (stockX != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stockX)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stockX)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stockX != null)
      ((javax.xml.rpc.Stub)stockX)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.server.StockX getStockX() {
    if (stockX == null)
      _initStockXProxy();
    return stockX;
  }
  
  public double getStockPrice(java.lang.String arg0) throws java.rmi.RemoteException{
    if (stockX == null)
      _initStockXProxy();
    return stockX.getStockPrice(arg0);
  }
  
  public java.lang.Boolean updateStock(java.lang.String arg0, double arg1) throws java.rmi.RemoteException{
    if (stockX == null)
      _initStockXProxy();
    return stockX.updateStock(arg0, arg1);
  }
  
  
}