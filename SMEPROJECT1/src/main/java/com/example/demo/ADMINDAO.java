package com.example.demo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository

public class ADMINDAO {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public ADMIN[] showADMIN() {
		String cmd = "select * from ADMIN";
		List<ADMIN> ADMINList = null;
		ADMINList = jdbcTemplate.query(cmd, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				ADMIN admin = new ADMIN();
				admin = new ADMIN();
				admin.setADMN_ID(rs.getInt("ADMN_ID"));
				admin.setADMN_NAME(rs.getString("ADMN_NAME"));
				admin.setEMAIL(rs.getString("EMAIL"));
				admin.setPASSWORD(rs.getString("PASSWORD"));
				return admin;
			}
		});
		return ADMINList.toArray(new ADMIN[ADMINList.size()]);
	}
}
