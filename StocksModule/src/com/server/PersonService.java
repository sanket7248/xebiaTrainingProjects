package com.server;

import com.server.model.Person;

public interface PersonService {
	public Person getPerson(int id);
	public boolean updatePerson(Person person,int id);
}
