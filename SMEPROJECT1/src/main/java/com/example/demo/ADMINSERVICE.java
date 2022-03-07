package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ADMINSERVICE {
	@Autowired
	ADMINDAO dao;
	
	public ADMIN[] showADMIN() {
		return dao.showADMIN();
	}
	}
