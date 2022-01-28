package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository

public class CustomerDAO {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public Customer[] showCustomer() {
		String cmd = "select * from Customer";
		List<Customer> customerList = null;
		customerList = jdbcTemplate.query(cmd, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer();
				customer = new Customer();
				customer.setCustomerid(rs.getInt("customerid"));
				customer.setCustomername(rs.getString("customername"));
				customer.setCustomercity(rs.getString("customercity"));
				customer.setCustomerstate(rs.getString("customerstate"));
				customer.setCustomeremail(rs.getString("customeremail"));
				customer.setCustomermobile(rs.getString("customermobile"));
				return customer;
			}
		});
		return customerList.toArray(new Customer[customerList.size()]);
	}
	
	public Customer searchCustomer(int customerid) {
		String cmd = "select * from Customer where customerid=?";
		List<Customer> customerList = jdbcTemplate.query(cmd, new Object[] {customerid}, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer();
				customer = new Customer();
				customer.setCustomerid(rs.getInt("customerid"));
				customer.setCustomername(rs.getString("customername"));
				customer.setCustomercity(rs.getString("customercity"));
				customer.setCustomerstate(rs.getString("customerstate"));
				customer.setCustomeremail(rs.getString("customeremail"));
				customer.setCustomermobile(rs.getString("customermobile"));
				return customer;
			}
		});
		if (customerList.size()==1) {
			return customerList.get(0);
		}
		return null;
	}
}
