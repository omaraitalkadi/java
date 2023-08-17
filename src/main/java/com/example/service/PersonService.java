package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("12");
		p.setAge(12);
		p.setFirstName("te");
		p.setLastName("te");
		persons.add(p);
	     Person y = new Person();
		y.setId("12");
		y.setAge(12);
		y.setFirstName("te");
		y.setLastName("te");
		persons.add(y);
		
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

