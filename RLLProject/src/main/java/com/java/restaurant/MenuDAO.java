package com.java.restaurant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.MenuListener;

import com.java.restaurant.Menu;
import com.java.restaurant.MenuDAO;

public class MenuDAO {
	Connection connection;
	PreparedStatement pst;
	
	public List <Menu> showMenu() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from menu";
		pst = connection.prepareStatement(cmd);
    	ResultSet rs = pst.executeQuery();
    	List<Menu> menuList = new ArrayList<Menu>();
    	Menu menu = null;
    	while(rs.next()) {	
    		menu=new Menu();
    		menu.setMenuid(rs.getInt("menuid"));
    		menu.setRestaurantid(rs.getInt("restaurantid"));
    		menu.setItemname(rs.getString("itemname"));
    		menu.setMenutype(rs.getString("menutype"));
    		menu.setPrice(rs.getString("price"));
    		
    		menuList.add(menu);
    	}
    	return menuList;
	}
	
	public Menu searchMenu(int menuid)  throws ClassNotFoundException, SQLException {
		 connection = ConnectionHelper.getConnection();
			String cmd = "select * from menu where menuid=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, menuid);
			Menu menu=null;
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
	    		menu=new Menu();
	    		menu.setMenuid(rs.getInt("menuid"));
	    		menu.setRestaurantid(rs.getInt("restaurantid"));
	    		menu.setItemname(rs.getString("itemname"));
	    		menu.setMenutype(rs.getString("menutype"));
	    		menu.setPrice(rs.getString("price"));
			}
		 return menu;
		 
	}
}
