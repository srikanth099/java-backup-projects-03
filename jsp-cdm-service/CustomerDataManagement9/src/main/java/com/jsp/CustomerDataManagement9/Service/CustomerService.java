package com.jsp.CustomerDataManagement9.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.CustomerDataManagement9.Dao.CustomerDAO;
import com.jsp.CustomerDataManagement9.Dto.CustomerDTO;
import com.jsp.CustomerDataManagement9.Dto.ResponseStructure;
import com.jsp.CustomerDataManagement9.Entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO dao;

	public ResponseStructure<Customer> saveCustomer(CustomerDTO dto) {
		Customer cus = new Customer(dto);
		Customer customer = dao.saveCustomer(cus);
		ResponseStructure<Customer> structure = new ResponseStructure<>();
		structure.setData(customer);
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("Customer data Saved sucessfully");
		structure.setTimeStamp(LocalDateTime.now());
		return structure;
	}

//	public Customer saveAllCustomers(Customer customer) {
//		return dao.saveAllCustomers(customer);
//	}

	public ResponseStructure<Customer> updateCustomer(Customer customer) {
		Customer cus = dao.saveCustomer(customer);
		ResponseStructure<Customer> structure = new ResponseStructure<>();
		structure.setData(cus);
		structure.setStatusCode(HttpStatus.ACCEPTED.value());
		structure.setTimeStamp(LocalDateTime.now());
		structure.setMessage(HttpStatus.ACCEPTED.name());
		return structure;
	}

	public ResponseStructure<List<Customer>> getAllCustomerData() {
		List<Customer> list = dao.getAllCustomerData();
		// if(list!=null)
		// if(list.isEmpty())
		ResponseStructure<List<Customer>> structure = new ResponseStructure<>();
		if (list.size() != 0) {
			structure.setStatusCode(HttpStatus.FOUND.value());
			structure.setData(list);
			structure.setTimeStamp(LocalDateTime.now());
			structure.setMessage("Customers entry found in database");
		} else {
			structure.setStatusCode(HttpStatus.NOT_FOUND.value());
			structure.setTimeStamp(LocalDateTime.now());
			structure.setData(null);
			structure.setMessage("No Customers entry found in database");
		}
		return structure;
	}

	public Customer getDataById(int id) {
		return dao.getCustomerDataById(id);
	}

	public Customer deleteCustomerDataById(int id) {
		return dao.deleteCustomerDataById(id);
	}

	public List<Customer> getCustomerByName(String name) {
		return dao.getCustomerByName(name);
	}

	public List<Customer> validateCustomer(String name, String email) {
		return dao.validateCustomer(name, email);
	}
}
