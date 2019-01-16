package com.server;

import javax.jws.WebService;

@WebService(name = "Person", targetNamespace = "http://server.com/")
public interface Person {

	Person getPerson(int id);

	boolean updatePerson(Person person, int id);

}