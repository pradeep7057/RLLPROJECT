package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

	@Autowired
	private MenuService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/showMenus")
	public Menu[] showMenus() {
		return service.showMenus();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/showMenu/{restaurantid}")
	public Menu[] showMenu(@PathVariable int restaurantid) {
		return service.showMenu(restaurantid);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/searchMenu/{menuid}")
	public Menu searchMenu(@PathVariable int menuid) {
		return service.searchMenu(menuid);
	}
}