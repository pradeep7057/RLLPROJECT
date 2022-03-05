package com.example.demo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository

public class ENGRDAO {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public ENGR[] showENGR() {
		String cmd = "select * from ENGR";
		List<ENGR> ENGRList = null;
		ENGRList = jdbcTemplate.query(cmd, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				ENGR engr = new ENGR();
				engr = new ENGR();
				engr.setENGR_ID(rs.getInt("ENGR_ID"));
				engr.setENGR_NAME(rs.getString("ENGR_NAME"));
				engr.setPINCODE(rs.getInt("Pincode"));
				engr.setMOBILE_NO(rs.getLong("Mobile_no"));
				return engr;
			}
		});
		return ENGRList.toArray(new ENGR[ENGRList.size()]);
	}
}
