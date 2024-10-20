package com.jsp.CustomerDataManagement9.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.jsp.CustomerDataManagement9.Entity.BankAccount;
import com.jsp.CustomerDataManagement9.Repository.BankAccountRepository;

@Repository
public class BankAccountDAO {

	@Autowired
	private BankAccountRepository repository;

	public BankAccount updateBankAccount(BankAccount baccount) {
		return repository.save(baccount);
	}
	
	public List<BankAccount> getAllBankAccounts() {
		return repository.findAll();
	}
	
	public List<BankAccount> getBankAccountByName(String name) {
		return repository.findByName(name);
	}
	
	public BankAccount getBankAccountById(Integer id) {
		return repository.findById(id).orElse(
				new BankAccount(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),null, null));
	}

}
