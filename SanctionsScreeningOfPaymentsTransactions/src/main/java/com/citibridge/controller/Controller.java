package com.citibridge.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citibridge.Transaction;
import com.citibridge.dao.SanctionDao;
import com.citibridge.pojos.Transactions;

@RestController
public class Controller {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	SanctionDao dao;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@GetMapping("/api/transaction")
	public List<Transactions> m1() throws SQLException {
		
	List<Transactions> transactions=dao.getTransactions();
	
	return transactions;
		
	}
	
	@GetMapping("/api/screenpass")
	public List<Transactions> m2() throws SQLException {
		
	List<Transactions> transactions=dao.getScreenPass();
	
	return transactions;
		
	}
	
	@GetMapping("/api/screenfail")
	public List<Transactions> m3() throws SQLException {
		
	List<Transactions> transactions=dao.getScreenfail();
	
	return transactions;
		
	}
	
	@GetMapping("/api/validationpass")
	public List<Transactions> m4() throws SQLException {
		
	List<Transactions> transactions=dao.getValidationPass();
	
	return transactions;
		
	}
	
	@GetMapping("/api/validationfail")
	public List<Transactions> m5() throws SQLException {
		
	List<Transactions> transactions=dao.getValidationFail();
	
	return transactions;
		
	}
	

}
