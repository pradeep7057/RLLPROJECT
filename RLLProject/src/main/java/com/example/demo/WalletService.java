package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WalletService {

	@Autowired
	WalletDAO dao;
	
	public Wallet[] showCustomerWallets(int customerid) {
		List<Wallet> walletList = dao.searchByCustomerId(customerid);
		return walletList.toArray(new Wallet[walletList.size()]);
	}
	
	public Wallet searchByWalletId(int walletId) {
		return dao.searchByWalletId(walletId);
	}
}