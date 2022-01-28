package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestaurantController {
	@Autowired
	private RestaurantService restaurantService;
	
	@RequestMapping("/restshow")
	public Restaurant[] show() {
		return restaurantService.showRestaurant();
	}
	
	@RequestMapping("/rest/{restaurantid}")
	public Restaurant search(@PathVariable int restaurantid) {
		return restaurantService.searchRestaurant(restaurantid);
	}
}
