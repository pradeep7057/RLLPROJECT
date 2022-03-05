package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MGRService {
	@Autowired
	MGRDAO dao;
	
	public MGR[] showMGR() {
		return dao.showMGR();
	}
	
}
