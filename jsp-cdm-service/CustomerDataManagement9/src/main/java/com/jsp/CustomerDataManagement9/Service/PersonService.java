package com.jsp.CustomerDataManagement9.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.CustomerDataManagement9.Dao.PersonDAO;
import com.jsp.CustomerDataManagement9.Entity.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDAO dao;

	public Person savePerson(Person person) {
		return dao.savePerson(person);
	}

	public Person updatePerson(Person person) {
		return dao.updatePerson(person);
	}

	public List<Person> getAllPersons() {
		return dao.getAllPersons();
	}

	public List<Person> getPersonByName(String name) {
		return dao.getPersonByName(name);
	}
	
	public Person getPersonById(Integer id) {
		return dao.getPersonById(id);
	}
	
	public Person deletePersonById(Integer id) {
		return dao.deletePersonById(id);
	}

	

}
