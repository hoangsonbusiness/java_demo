package com.example.demo.model;

public class Person {
	private String id;
	private String firstName;
	private String lastName;

	public Person() {

	}

	public Person(String id ,String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
