package com.server;

import javax.jws.WebService;

import com.server.model.Person;

@WebService(targetNamespace = "http://server.com/", endpointInterface = "com.server.PersonSEI", portName = "PersonServiceImplPort", serviceName = "PersonServiceImplService")
public class PersonServiceImpl implements PersonService, PersonSEI {

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.setGrade(1d);
		person.setId(1212);
		person.setName("sdfsdfsdf");
		return person;
	}

	@Override
	public boolean updatePerson(Person person, int id) {
		// TODO Auto-generated method stub
		return true;
	}

}
