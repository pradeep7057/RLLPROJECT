package com.example.demo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MenuDAO {

	@Autowired
    JdbcTemplate jdbcTemplate;

	public Menu searchMenu(int menuid) {
		String cmd = "select * from Menu where menuid=?";
		List<Menu> menuList = jdbcTemplate.query(cmd, new Object[] {menuid}, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Menu menu= new Menu();
				menu.setMenuId(rs.getInt("menuId"));
				menu.setRestaurantId(rs.getInt("restaurantId"));
				menu.setItemName(rs.getString("itemName"));
				menu.setMenutype(rs.getString("menutype"));
				menu.setPrice(rs.getInt("price"));
				return menu;
			}
		});
		if (menuList.size()==1) {
			return menuList.get(0);
		}
		return null;
	}
	
	public List<Menu> showMenus(int restaurantId) {
		String cmd = "select * from menu where RESTAURANTID=?";
		List<Menu> menuList = jdbcTemplate.query(cmd, 
				new Object[] {restaurantId}, new RowMapper(){
					@Override
					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
						Menu menu = new Menu();
						menu.setMenuId(rs.getInt("menuid"));
						menu.setRestaurantId(rs.getInt("restaurantid"));
						menu.setItemName(rs.getString("itemname"));
						menu.setMenutype(rs.getString("menutype"));
						menu.setPrice(rs.getInt("Price"));
						return menu;
					}
		});
		return menuList;
	}
	
	public Menu[] showMenus() {
		String cmd = "select * from Menu";
		List<Menu> MenuList = null;
		MenuList = jdbcTemplate.query(cmd, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Menu menu= new Menu();
				menu.setMenuId(rs.getInt("menuId"));
				menu.setRestaurantId(rs.getInt("restaurantId"));
				menu.setItemName(rs.getString("itemName"));
				menu.setMenutype(rs.getString("menutype"));
				menu.setPrice(rs.getInt("price"));
				return menu;			
			}
		});
		return MenuList.toArray(new Menu[MenuList.size()]);
	}
	public Menu[] showMenu(int restaurantid) {
		String cmd = "select * from Menu";
		List<Menu> MenuList = null;
		MenuList = jdbcTemplate.query(cmd, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Menu menu= new Menu();
				menu.setMenuId(rs.getInt("menuId"));
				menu.setRestaurantId(rs.getInt("restaurantId"));
				menu.setItemName(rs.getString("itemName"));
				menu.setMenutype(rs.getString("menutype"));
				menu.setPrice(rs.getInt("price"));
				return menu;			}
		});
		return MenuList.toArray(new Menu[MenuList.size()]);
	}
}