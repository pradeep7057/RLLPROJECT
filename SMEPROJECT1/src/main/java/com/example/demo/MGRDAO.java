package com.example.demo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository

public class MGRDAO {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public MGR[] showMGR() {
		String cmd = "select * from mgr";
		List<MGR> MGRList = null;
		MGRList = jdbcTemplate.query(cmd, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				MGR mgr = new MGR();
				mgr = new MGR();
				mgr.setMGR_ID(rs.getInt("MGR_ID"));
			    mgr.setMGR_NAME(rs.getString("MGR_NAME"));
				mgr.setPINCODE(rs.getInt("Pincode"));
				mgr.setMOBILE_NO(rs.getLong("Mobile_no"));
				return mgr;
			}
		});
		return MGRList.toArray(new MGR[MGRList.size()]);
	}
}
