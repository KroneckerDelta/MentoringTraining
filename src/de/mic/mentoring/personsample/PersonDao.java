package de.mic.mentoring.personsample;

import java.util.Collection;

public interface PersonDao {

	Person create(Person person);

	Collection<Person> read();

	Person update(Person person);

	void delete(Person person);
}
