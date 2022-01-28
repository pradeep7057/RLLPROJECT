package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MenuService {
	@Autowired
	MenuDAO dao;
	
	public Menu[] showMenus() {
		return dao.showMenus();
	}
	public Menu[] showMenu(int restaurantid) {
		List<Menu> menuList = dao.showMenus(restaurantid);
		return menuList.toArray(new Menu[menuList.size()]);
	}
	public Menu searchMenu(int menuID) {
		return dao.searchMenu(menuID);
	}
}