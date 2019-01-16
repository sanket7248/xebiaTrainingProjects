package com.server;

public class AccountProxy implements com.server.Account {
  private String _endpoint = null;
  private com.server.Account account = null;
  
  public AccountProxy() {
    _initAccountProxy();
  }
  
  public AccountProxy(String endpoint) {
    _endpoint = endpoint;
    _initAccountProxy();
  }
  
  private void _initAccountProxy() {
    try {
      account = (new com.server.AccountServiceLocator()).getAccount();
      if (account != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)account)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)account)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (account != null)
      ((javax.xml.rpc.Stub)account)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.server.Account getAccount() {
    if (account == null)
      _initAccountProxy();
    return account;
  }
  
  public java.lang.String getName(int accountNo) throws java.rmi.RemoteException{
    if (account == null)
      _initAccountProxy();
    return account.getName(accountNo);
  }
  
  public java.lang.String readBalance(java.lang.String name) throws java.rmi.RemoteException{
    if (account == null)
      _initAccountProxy();
    return account.readBalance(name);
  }
  
  
}