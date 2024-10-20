package com.jsp.CustomerDataManagement9.Dto;

import java.io.Serializable;

import com.jsp.CustomerDataManagement9.Entity.Customer;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable{

	private Integer id;
	
	private String name;
	
	private String email;
	
	

	public CustomerDTO(Customer customer){
		this.id=customer.getId();
		this.name=customer.getName();
		this.email=customer.getEmail();
	}



	public CustomerDTO(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

}
