package de.mic.mentoring.personsample.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import de.mic.mentoring.personsample.dao.PersonDao;
import de.mic.mentoring.personsample.model.Person;

public class TestDao implements PersonDao {

	Collection<Person> persons = new ArrayList<>();

	@Override
	public Person create(Person person) {
		return new Person();
	}

	@Override
	public Collection<Person> read() {
		return persons;
	}

	@Override
	public Person update(Person person) {
		// does this work?
		Collections.replaceAll(new ArrayList<Person>(persons), person, person);
		return person;
	}

	@Override
	public void delete(Person person) {
		persons.remove(person);

	}

}
