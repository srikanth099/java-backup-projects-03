package com.jsp.CustomerDataManagement9.Entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jsp.CustomerDataManagement9.Dto.CustomerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;//tool which is used to decrese the boiling plate for the project//
import lombok.NoArgsConstructor;

//while haveing repeating code is nothing but boiling plate code
// most of the time getters and setters are the boiler plate code
@Data
@NoArgsConstructor // generate default/default con
@AllArgsConstructor // generate parametirized constured
@Entity
@Table(name = "customer_info")
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String name;
	private String email;
	
	public Customer(CustomerDTO dto){
		this.id=dto.getId();
		this.name=dto.getName();
		this.email=dto.getEmail();
	}

}
