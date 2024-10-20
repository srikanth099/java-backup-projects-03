package com.jsp.CustomerDataManagement9.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.jsp.CustomerDataManagement9.Entity.Person;
import com.jsp.CustomerDataManagement9.Repository.PersonRepository;

@Repository
public class PersonDAO {

	@Autowired
	private PersonRepository repository;

	public Person savePerson(Person person) {
		return repository.save(person);
	}

	public Person updatePerson(Person person) {
		return repository.save(person);
	}

	public List<Person> getAllPersons() {
		return repository.findAll();
	}

	public List<Person> getPersonByName(String name) {
		return repository.getPersonByName(name);
	}

	public Person getPersonById(Integer id) {
		return repository.findById(id).orElse(new Person(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.name(),
				HttpStatus.NOT_FOUND.name(), null));
	}

	public Person deletePersonById(Integer id) {
		Person person = getPersonById(id);
		if (person.getId() != 404) {
			repository.deleteById(id);
		}
		return person;
	}

}
