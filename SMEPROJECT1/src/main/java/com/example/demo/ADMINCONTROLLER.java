package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ADMINCONTROLLER {
	@Autowired
	private ADMINSERVICE adminService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/Admin")
	public ADMIN[] showADMIN() {
		return adminService.showADMIN();
	}
}



