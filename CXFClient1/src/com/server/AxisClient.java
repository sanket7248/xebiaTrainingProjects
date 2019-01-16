package com.server;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class AxisClient {

	public static void main(String[] args) throws ServiceException, RemoteException {
		// TODO Auto-generated method stub
		AccountServiceLocator accountServiceLocator=new AccountServiceLocator();
		AccountSEI accountPort = accountServiceLocator.getAccountPort();
		String name = accountPort.getName(1234);
		System.out.println("name reeived - "+name);
		String readBalance = accountPort.readBalance(name);
		System.out.println("Balance - "+readBalance);
		
	}

}
