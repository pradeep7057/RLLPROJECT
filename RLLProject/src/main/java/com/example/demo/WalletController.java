package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

	@Autowired
	WalletService service;
	
	@RequestMapping("/showAllWallets/{customerId}")
	public Wallet[] showAllWallet(@PathVariable int customerId) {
		return service.showCustomerWallets(customerId);
	}
	
	@RequestMapping("/searchByWalletId/{walletId}")
	public Wallet searchByWalletId(@PathVariable int walletId) {
		return service.searchByWalletId(walletId);
	}
}