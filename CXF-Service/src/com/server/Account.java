package com.server;

import javax.jws.WebService;

@WebService(targetNamespace = "http://server.com/", endpointInterface = "com.server.AccountSEI", portName = "AccountPort", serviceName = "AccountService")
public class Account implements AccountSEI {
	public String getName(int accountNo) {
		System.out.println(accountNo);
		return "User account: " + accountNo;
	}

	public String readBalance(String name) {
		System.out.println("Account balance for : " + name);
		return "User Account name: " + name;
	}
	
	private void log(String msg) {
		System.out.println("Log message: "+msg);
	}

}
