package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrdersServices {

	@Autowired
	OrdersDAO dao;
	
	public Orders[] showCOrders(int customerid) {
		return dao.showCOrders(customerid);
	}
	public Orders[] showCPOrders(int customerid) {
		return dao.showCPOrders(customerid);
	}
	public Orders[] showVOrders(int vendorid){
		return dao.showVOrders(vendorid);
	}
	public Orders[] showVPOrders(int vendorid) {
		return dao.showVPOrders(vendorid);	
	}
	public Orders searchByOrderId(int orderid) {
		return dao.searchOrder(orderid);
	}
	public String placeOrder(Orders order) {
		return dao.placeOrder(order);
	}
	public String acceptOrRejectOrder(int orderid, int vendorid, String status) {
		return dao.acceptOrRejectOrder(orderid, vendorid, status);
	}
}