package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Remove;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.model.Student;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MainController {
 
    private static List<Person> persons = new ArrayList<Person>();
    private static List<Student> students = new ArrayList<Student>();
 
    static {
        persons.add(new Person("1", "Bill", "Gates"));
        persons.add(new Person("2", "Steve", "Jobs"));
        students.add(new Student("1", "Son", "Hoang"));
        students.add(new Student("2", "Tu", "Hiep"));
    }
 
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
 
        String message = "Hello Spring Boot + JSP";
 
        model.addAttribute("message", message);
 
        return "index";
    }
 
    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String viewPersonList(Model model) { 
 
        model.addAttribute("persons", persons);
 
        return "personList";
    }
    
    @RequestMapping(value = {"/get/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Person get(@PathVariable("id") String id) {
    	int i = 0;
    	for (Person person : this.persons) {
			if (id.equals(person.getId())) {
				return this.persons.get(i);
			}
			i++;
		}
    	return new Person("NOT FOUND", "xxx", "yyy");
    }
    
    @RequestMapping(value = {"/getList/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Student[] getList(@PathVariable("id") String id) {
    	Student[] a = new Student[2];
    	a[0] = this.students.get(0);
    	a[1] = this.students.get(1);
    	return a;
    }
    
//    @RequestMapping(value = {"/register"}, method = RequestMethod.POST)
//    public @ResponseBody List<Person> getPer(@RequestBody Person person) {
//    	int i = 0;
//    	for (Person perso : this.persons) {
//			if (String.valueOf(i).equals(perso.getId())) {
//				return this.persons;
//			}
//			i++;
//		}
//    	this.persons.add(person);
//    	
//    	return this.persons;
//    }
    
    @RequestMapping(value = {"/register"}, method = RequestMethod.POST)
    public @ResponseBody Response getPer(@RequestBody Student student) {
    	for (Student stude : this.students) {
			if (student.getStudent_id().equals(stude.getStudent_id())) {
				return new Response("DA TON TAI");
			}
		}
    	this.students.add(student);
    	
    	return new Response("DA ADD");
    }
    
    @RequestMapping(value = {"/delete/{id}"}, method = RequestMethod.POST)
    public @ResponseBody Person delete(@PathVariable("id") String id) {
    	int i = 0;
    	for (Person person : this.persons) {
			if (id.equals(person.getId())) {
				this.persons.remove(i);
				return this.persons.get(i);
			}
			i++;
		}
    	return new Person("NOT FOUND", "xxx", "yyy");
    }
    
 
}

class Response{
	public String status;

	Response(String status){
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
