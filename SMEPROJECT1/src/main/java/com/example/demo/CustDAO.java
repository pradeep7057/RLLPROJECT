package com.example.demo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository

public class CustDAO {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public Cust[] showCust() {
		String cmd = "select * from cust";
		List<Cust> custList = null;
		custList = jdbcTemplate.query(cmd, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Cust cust = new Cust();
				cust = new Cust();
				cust.setCust_ID(rs.getInt("Cust_ID"));
				cust.setCust_Name(rs.getString("Cust_Name"));
				cust.setAddress(rs.getString("Address"));
				cust.setPincode(rs.getInt("Pincode"));
				cust.setMobile_no(rs.getLong("Mobile_no"));
				return cust;
			}
		});
		return custList.toArray(new Cust[custList.size()]);
	}
}
