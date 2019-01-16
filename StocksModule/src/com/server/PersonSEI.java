package com.server;

import javax.jws.WebService;

import com.server.model.Person;

@WebService(name = "PersonSEI", targetNamespace = "http://server.com/")
public interface PersonSEI {

	Person getPerson(int id);

	boolean updatePerson(Person person, int id);

}