package com.jsp.CustomerDataManagement9.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.CustomerDataManagement9.Dao.BankAccountDAO;
import com.jsp.CustomerDataManagement9.Entity.BankAccount;

@Service
public class BankAccountService {

	@Autowired
	private BankAccountDAO dao;

	public BankAccount updateBankAccount(BankAccount baccount) {
		return dao.updateBankAccount(baccount);
	}
	public List<BankAccount> getAllBankAcoounts() {
		return dao.getAllBankAccounts();
	}
	public List<BankAccount> getBankAccountByName(String name) {
		return dao.getBankAccountByName(name);
	}
	public BankAccount getBankAccountbyId(Integer id) {
		return dao.getBankAccountById(id);
	}

}
