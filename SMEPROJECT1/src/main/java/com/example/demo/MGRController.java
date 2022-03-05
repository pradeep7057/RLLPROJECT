package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MGRController {
	@Autowired
	private MGRService MGRService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/MGR")
	public MGR[] showMGR() {
		return MGRService.showMGR();
	}
}