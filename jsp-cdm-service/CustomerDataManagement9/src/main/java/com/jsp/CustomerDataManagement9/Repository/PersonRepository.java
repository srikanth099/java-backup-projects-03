package com.jsp.CustomerDataManagement9.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.CustomerDataManagement9.Entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

	List<Person> getPersonByName(String name);
	
}
