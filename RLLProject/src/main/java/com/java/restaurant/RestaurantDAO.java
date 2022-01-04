package com.java.restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.java.restaurant.Restaurant;
import com.java.restaurant.RestaurantDAO;

public class RestaurantDAO {
	Connection connection;
	PreparedStatement pst;
	
	
	public List <Restaurant> showRest() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from restaurant";
		pst = connection.prepareStatement(cmd);
    	ResultSet rs = pst.executeQuery();
    	List<Restaurant> restList = new ArrayList<Restaurant>();
    	Restaurant rest = null;
    	while(rs.next()) {
    		rest = new Restaurant();
    		rest.setRestaurantid(rs.getInt("restaurantID"));
    		rest.setRestaurantname(rs.getString("restaurantName"));
    		rest.setCity(rs.getString("city"));
    		rest.setBranch(rs.getString("branch"));
    		rest.setEmail(rs.getString("email"));
    		rest.setContactno(rs.getString("contactNo"));
    		restList.add(rest);
    	}
		return restList;

}

	public Restaurant searchRest(int restaurantid)  throws ClassNotFoundException, SQLException {
		 connection = ConnectionHelper.getConnection();
		 String cmd="select * from restaurant where restaurantid=?";
		 pst = connection.prepareStatement(cmd);
		 pst.setInt(1, restaurantid);
		 Restaurant rest=null;
		 ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				rest = new Restaurant();
				rest.setRestaurantid(rs.getInt("restaurantid"));
				rest.setRestaurantname(rs.getString("restaurantname"));
				rest.setCity(rs.getString("city"));
	    		rest.setBranch(rs.getString("branch"));
	    		rest.setEmail(rs.getString("email"));
	    		rest.setContactno(rs.getString("contactNo"));
				
				
				}
			
		return rest;
		
	}
	}
	
