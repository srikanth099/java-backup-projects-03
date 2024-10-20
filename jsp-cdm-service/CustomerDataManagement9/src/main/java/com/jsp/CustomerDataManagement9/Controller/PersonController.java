package com.jsp.CustomerDataManagement9.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.CustomerDataManagement9.Entity.Person;
import com.jsp.CustomerDataManagement9.Service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@PostMapping("/person")
	public Person savePerson(@RequestBody  Person person) {
		return service.savePerson(person);
	}
	
	@PutMapping("/updatePerson")
	public Person updatePerson(@RequestBody Person person) {
		return service.updatePerson(person);
	}
	
	@GetMapping("/getAllPersons")
	public List<Person> getAllPersons() {
		return service.getAllPersons();
	}
	
	@GetMapping("/getPByName/{name}")
	public List<Person> getPersonByName(@PathVariable("name") String name) {
		return service.getPersonByName(name);
	}
	
	@GetMapping("/getPById/{id}")
	public Person getPersonById(@PathVariable("id") Integer id) {
		return service.getPersonById(id);
	}
	
	@DeleteMapping("/deletePById")
	public Person deletePersonById(@RequestParam("id")Integer id) {
		return service.deletePersonById(id);
	}

}
