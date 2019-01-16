package com.server;

import javax.jws.WebService;

@WebService(name = "AccountSEI", targetNamespace = "http://server.com/")
public interface AccountSEI {

	String getName(int accountNo);

	String readBalance(String name);

}