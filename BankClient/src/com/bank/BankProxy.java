package com.bank;

public class BankProxy implements com.bank.Bank {
  private String _endpoint = null;
  private com.bank.Bank bank = null;
  
  public BankProxy() {
    _initBankProxy();
  }
  
  public BankProxy(String endpoint) {
    _endpoint = endpoint;
    _initBankProxy();
  }
  
  private void _initBankProxy() {
    try {
      bank = (new com.bank.BankServiceLocator()).getBank();
      if (bank != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bank)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bank)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bank != null)
      ((javax.xml.rpc.Stub)bank)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bank.Bank getBank() {
    if (bank == null)
      _initBankProxy();
    return bank;
  }
  
  public com.bank.User readUserFromAccounts(int userId) throws java.rmi.RemoteException{
    if (bank == null)
      _initBankProxy();
    return bank.readUserFromAccounts(userId);
  }
  
  public com.bank.Address getLocationForUser(com.bank.User user) throws java.rmi.RemoteException{
    if (bank == null)
      _initBankProxy();
    return bank.getLocationForUser(user);
  }
  
  
}