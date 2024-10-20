package com.jsp.CustomerDataManagement9.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.CustomerDataManagement9.Entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer>{

	List<BankAccount> findByName(String name);

}
