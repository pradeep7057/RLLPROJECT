package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ENGRService {
	@Autowired
	ENGRDAO dao;
	
	public ENGR[] showENGR() {
		return dao.showENGR();
	}
	
}
