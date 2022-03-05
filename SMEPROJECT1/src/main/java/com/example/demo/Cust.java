package com.example.demo;

public class Cust {
	private int Cust_ID;
	private String Cust_Name;
	private String Address;
	private int Pincode;
	private Long Mobile_no;
	
	public int getCust_ID() {
		return Cust_ID;
	}
	public void setCust_ID(int Cust_ID){
		this.Cust_ID = Cust_ID;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String Cust_Name) {
		this.Cust_Name = Cust_Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int Pincode) {
		this.Pincode = Pincode;
	}
	public Long getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(long Mobile_no) {
		this.Mobile_no = Mobile_no;
	}
	
}

