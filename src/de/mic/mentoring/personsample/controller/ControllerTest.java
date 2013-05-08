package de.mic.mentoring.personsample.controller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import de.mic.mentoring.personsample.model.Person;

public class ControllerTest {

	Controller underTest = null;
	private Person person;
	TestDao dao = null;

	@Before
	public void init() {
		dao = new TestDao();
		underTest = new Controller(dao);
		person = new Person("Thomas", "Michael", new GregorianCalendar(1970,
				10, 18).getTime());

	}

	@Test
	public void createPersonShouldNotNull() {
		underTest.actionSaveNewPerson(person);
		assertNotNull(dao.read());
	}

	@Test
	public void createPersonShouldNotEmpty() {
		underTest.actionSaveNewPerson(person);
		assertFalse(dao.read().isEmpty());

	}

	@Test
	public void createdPersonShouldBeLoadedByDao() {
		underTest.actionSaveNewPerson(person);
		Collection<Person> showPersonList = dao.read();
		assertTrue(showPersonList.contains(person));
	}

	@Test
	public void createdPersonShouldBeLoadedByController() {
		underTest.actionSaveNewPerson(person);
		Collection<Person> showPersonList = underTest.showPersonList();
		assertTrue(showPersonList.contains(person));
	}
}
