package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String student_id;
	private String student_firstName;
	private String student_lastName;

	public Student() {

	}

	public Student(String id, String firstName, String lastName) {
		this.student_id = id;
		this.student_firstName = firstName;
		this.student_lastName = lastName;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getStudent_firstName() {
		return student_firstName;
	}

	public void setStudent_firstName(String student_firstName) {
		this.student_firstName = student_firstName;
	}

	public String getStudent_lastName() {
		return student_lastName;
	}

	public void setStudent_lastName(String student_lastName) {
		this.student_lastName = student_lastName;
	}

	public static void main(String[] args) {
		Double a = (1d/2);
		System.out.println(a);
		//final String b = "ccc";
		//b= "ddd";
		final List c =  new ArrayList();
		c.add("new");
		System.out.println(c.get(0));
	}
}
