package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
	@Autowired
	private OrdersServices ordersService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/co/{customerid}")
	public Orders[] showCOrders(@PathVariable int customerid) {
		return ordersService.showCOrders(customerid);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/showCPOrders/{customerid}")
	public Orders[] showCPOrders(@PathVariable int customerid) {
		return ordersService.showCPOrders(customerid);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/showVOrders/{vendorid}")
	public Orders[] showVOrders(@PathVariable int vendorid) {
		return ordersService.showVOrders(vendorid);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/showVPOrders/{vendorid}")
	public Orders[] showVPOrders(@PathVariable int vendorid) {
		return ordersService.showVPOrders(vendorid);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/orderSearch/{orderid}")
	public Orders orderSearch(@PathVariable int orderid) {
		return ordersService.searchByOrderId(orderid);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/acceptOrRejectOrder/{ordId}/{venId}/{status}")
	public String acceptOrReject(@PathVariable int ordId,@PathVariable int venId,
	@PathVariable String status) {
	return ordersService.acceptOrRejectOrder(ordId, venId, status);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/orders/placeOrder")
	public String add(@RequestBody Orders orders) {
	return ordersService.placeOrder(orders);
	}
}