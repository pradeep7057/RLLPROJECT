package com.example.demo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class WalletDAO {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public List<Wallet> searchByCustomerId(int customerid) {
		String cmd = "select * from wallet where customerid=?";
		List<Wallet> walletList = jdbcTemplate.query(cmd, 
				new Object[] {customerid}, new RowMapper(){
					@Override
					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
						Wallet wallet = new Wallet();
						wallet.setWalletId(rs.getInt("walletid"));
						wallet.setCustomerId(rs.getInt("customerid"));
						wallet.setWallettype(rs.getString("wallettype"));
						wallet.setAmount(rs.getInt("amount"));
						return wallet;
					}
		});
		return walletList;
		
	}
	
	public String deductBalance(int walletId, int billAmount) {
		String cmd = "update wallet set amount=amount-? where walletId=?";
		jdbcTemplate.update(cmd, new Object[] {billAmount,walletId});
		return "Amount Deducted...";
	}
	
	public Wallet searchByWalletId(int walletId) {
		String cmd = "select * from wallet where walletid=?";
		List<Wallet> walletList = jdbcTemplate.query(cmd, 
				new Object[] {walletId}, new RowMapper(){
					@Override
					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
						Wallet wallet = new Wallet();
						wallet.setWalletId(rs.getInt("walletid"));
						wallet.setCustomerId(rs.getInt("customerid"));
						wallet.setWallettype(rs.getString("wallettype"));
						wallet.setAmount(rs.getInt("amount"));
						return wallet;
					}
		});
		return walletList.get(0);
		
	}

}