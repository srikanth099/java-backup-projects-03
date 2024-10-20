package com.jsp.CustomerDataManagement9.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.CustomerDataManagement9.Entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findByName(String name);

	// is used to pass query
	@Query("SELECT c FROM Customer c WHERE c.name=:name AND c.email=:email")
	List<Customer> validateCustomer(@Param("name") String name, @Param("email") String email);

//	Customer saveAllCustomers(Customer customer);


}
//jpa repository requires entity class name & (@Id) primary key non primitive data type value
// jpa interface have abstart methods SAVE,DELETE,FIND.so its already
// implemented.we dont need to write code.
// java persistance api repository

//findBy___namethis name will be matching property name in entiry class
