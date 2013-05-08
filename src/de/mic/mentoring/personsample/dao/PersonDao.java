package de.mic.mentoring.personsample.dao;

import java.util.Collection;

import de.mic.mentoring.personsample.model.Person;

public interface PersonDao {

	void create(Person person);

	Collection<Person> read();

	Person update(Person person);

	void delete(Person person);
}
