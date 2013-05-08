package de.mic.mentoring.personsample.controller;

public class ControllerTest {

	Controller underTest = null;

	public void init() {
		underTest = new Controller(new TestDao());
	}
}
