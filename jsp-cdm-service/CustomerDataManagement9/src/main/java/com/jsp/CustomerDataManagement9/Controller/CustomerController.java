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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.CustomerDataManagement9.Dto.CustomerDTO;
import com.jsp.CustomerDataManagement9.Dto.ResponseStructure;
import com.jsp.CustomerDataManagement9.Entity.Customer;
import com.jsp.CustomerDataManagement9.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
//we are reciving data enitity class as of now b
	
	@PostMapping("/customer")
	public @ResponseBody ResponseStructure<Customer> saveCustomer(@RequestBody CustomerDTO dto) {
		return service.saveCustomer(dto);// Test Passed
	}
	
//	@PostMapping("/allCustomers")
//	public @ResponseBody Customer saveAllCustomers(Customer customer) {
//		return service.saveAllCustomers(customer);
//	}

	@PutMapping("/customer")
	public @ResponseBody ResponseStructure<Customer> updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);// Test Failure
	}

	@GetMapping("/customer")
	public @ResponseBody ResponseStructure<List<Customer>> getAllCustomer() {
		return service.getAllCustomerData();// Test Passed
	}

	@GetMapping("/customer/{id}")
	public @ResponseBody Customer getCustomerDataById(@PathVariable("id") int id) {
		return service.getDataById(id);// Test Passed
	}

	@DeleteMapping("/customer")
	public @ResponseBody Customer deleteCustomerDataById(@RequestParam("id") int id) {
		return service.deleteCustomerDataById(id);// Test Failures
	}

	@GetMapping("/customerbyname/{name}") // changing url
	public @ResponseBody List<Customer> getCustomerByName(@PathVariable("name") String name) {
		return service.getCustomerByName(name);
	}

	@PostMapping("/validatecustomer")
	public List<Customer> validateCustomer(@RequestParam("name") String name, @RequestParam("email") String email) {
		return service.validateCustomer(name, email);
	}
}
//{ } can mannage accepting dynimical data by enduser,it doesnt depend what you given either
//"/customer{id}" or "/customer{name}" so we using differnt way
//Navigation of CDM Project
//Controller(C) to Service(C) to DAO(C) to Repository(I).
// "/customer" why we are using meance url is unique but onternally it takes mapping type and it will decide 