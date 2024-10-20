package com.jsp.CustomerDataManagement9.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.CustomerDataManagement9.Entity.BankAccount;
import com.jsp.CustomerDataManagement9.Service.BankAccountService;

@RestController
public class BankAccountController {

	@Autowired
	private BankAccountService service;
	
	@PutMapping("/updateBankAccount")
	public BankAccount updateBankAccount(@RequestBody BankAccount baccount) {
		return service.updateBankAccount(baccount);
	}
	
	@GetMapping("/getAllBankAccounts")
	public List<BankAccount> getAllBankAccounts() {
		return service.getAllBankAcoounts();
	}
	
	@GetMapping("/getBankAccountByName/{name}")
	public List<BankAccount> getBankAccountByName(@PathVariable("name")String name) {
		return service.getBankAccountByName(name);
	}
	
	@GetMapping("/getBankAccountByid/{id}")
	public BankAccount getBankAccountById(@RequestParam("id") Integer id) {
		return service.getBankAccountbyId(id);
	}
	
}
