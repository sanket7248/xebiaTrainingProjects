package com.server;

public class AccountSEIProxy implements com.server.AccountSEI {
  private String _endpoint = null;
  private com.server.AccountSEI accountSEI = null;
  
  public AccountSEIProxy() {
    _initAccountSEIProxy();
  }
  
  public AccountSEIProxy(String endpoint) {
    _endpoint = endpoint;
    _initAccountSEIProxy();
  }
  
  private void _initAccountSEIProxy() {
    try {
      accountSEI = (new com.server.AccountServiceLocator()).getAccountPort();
      if (accountSEI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)accountSEI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)accountSEI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (accountSEI != null)
      ((javax.xml.rpc.Stub)accountSEI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.server.AccountSEI getAccountSEI() {
    if (accountSEI == null)
      _initAccountSEIProxy();
    return accountSEI;
  }
  
  public java.lang.String getName(int arg0) throws java.rmi.RemoteException{
    if (accountSEI == null)
      _initAccountSEIProxy();
    return accountSEI.getName(arg0);
  }
  
  public java.lang.String readBalance(java.lang.String arg0) throws java.rmi.RemoteException{
    if (accountSEI == null)
      _initAccountSEIProxy();
    return accountSEI.readBalance(arg0);
  }
  
  
}