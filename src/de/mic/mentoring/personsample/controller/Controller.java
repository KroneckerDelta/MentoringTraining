package de.mic.mentoring.personsample.controller;

import java.util.Collection;

import de.mic.mentoring.personsample.dao.PersonDao;
import de.mic.mentoring.personsample.model.Person;

public class Controller {

	PersonDao dao;

	public Controller(PersonDao dao) {
		this.dao = dao;
	}

	public Collection<Person> showPersonList() {
		return dao.read();
	}

	public void actionShowDetail() {

	}

	public void actionSaveNewPerson(Person person) {
		dao.create(person);
	}

	public void actionUpdatePerson(Person person) {
		dao.update(person);
	}

	public void actionDeletePerson(Person person) {
		dao.delete(person);
	}
}
