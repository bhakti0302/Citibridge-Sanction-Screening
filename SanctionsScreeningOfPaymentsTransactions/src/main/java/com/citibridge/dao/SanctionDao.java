package com.citibridge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.citibridge.pojos.Transactions;

@Component
public class SanctionDao {
	
	public SanctionDao() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<Transactions> getTransactions() throws SQLException{
		Connection connection = dataSource.getConnection();
		PreparedStatement pst=connection.prepareStatement("select * from transactions");
		ResultSet rs=pst.executeQuery();
		
		List<Transactions> list=new ArrayList<Transactions>();
		
		while(rs.next()) {
		
			Transactions ts=new Transactions(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
		list.add(ts);
			
		}
		
		return list;
		
	}
	
	public List<Transactions> getScreenPass() throws SQLException{
		Connection connection = dataSource.getConnection();
		PreparedStatement pst=connection.prepareStatement("select * from Transactions where screening = \"pass\"");
		ResultSet rs=pst.executeQuery();
		
		List<Transactions> list=new ArrayList<Transactions>();
		
		while(rs.next()) {
		
			Transactions ts=new Transactions(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
		list.add(ts);
			
		}
		
		return list;
		
	}
	
	public List<Transactions> getScreenfail() throws SQLException{
		Connection connection = dataSource.getConnection();
		PreparedStatement pst=connection.prepareStatement("select * from Transactions where screening = \"fail\"");
		ResultSet rs=pst.executeQuery();
		
		List<Transactions> list=new ArrayList<Transactions>();
		
		while(rs.next()) {
		
			Transactions ts=new Transactions(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
		list.add(ts);
			
		}
		
		return list;
		
	}
	
	public List<Transactions> getValidationPass() throws SQLException{
		Connection connection = dataSource.getConnection();
		PreparedStatement pst=connection.prepareStatement("select * from Transactions where validations = \"pass\"");
		ResultSet rs=pst.executeQuery();
		
		List<Transactions> list=new ArrayList<Transactions>();
		
		while(rs.next()) {
		
			Transactions ts=new Transactions(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
		list.add(ts);
			
		}
		
		return list;
		
	}
	
	public List<Transactions> getValidationFail() throws SQLException{
		Connection connection = dataSource.getConnection();
		PreparedStatement pst=connection.prepareStatement("select * from Transactions where validations = \"fail\"");
		ResultSet rs=pst.executeQuery();
		
		List<Transactions> list=new ArrayList<Transactions>();
		
		while(rs.next()) {
		
			Transactions ts=new Transactions(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
		list.add(ts);
			
		}
		
		return list;
		
	}

}
