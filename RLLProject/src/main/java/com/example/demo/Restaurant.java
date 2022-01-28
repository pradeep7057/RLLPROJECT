package com.example.demo;

public class Restaurant {
	
	private int restaurantid;
	private String restaurantname;;
	private String City;
	private String Branch;
	private String Email;
	private String ContactNo;
	public int getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(int restaurantid) {
		this.restaurantid = restaurantid;
	}
	public String getRestaurantname() {
		return restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantid=" + restaurantid + ", restaurantname=" + restaurantname + ", City=" + City + ", Branch=" + Branch + ", Email="
				+ Email + ", ContactNo=" + ContactNo + "]";
	}
	

}
