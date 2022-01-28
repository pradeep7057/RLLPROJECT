package com.example.demo;

import java.sql.Date;

public class Orders {

	private int orderid;
	private int vendorid;
	private int customerid;
	private int menuid;
	private int walletId;
	private Date orderDate;
	private int quantityOrdered;
	private String orderStatus;
	private int billAmount;
	private String Comments;
	public int getorderid() {
		return orderid;
	}
	public void setorderid(int orderid) {
		this.orderid = orderid;
	}
	public int getvendorid() {
		return vendorid;
	}
	public void setvendorid(int vendorid) {
		this.vendorid = vendorid;
	}
	public int getcustomerid() {
		return customerid;
	}
	public void setcustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getmenuid() {
		return menuid;
	}
	public void setmenuid(int menuid) {
		this.menuid = menuid;
	}
	public int getwalletId() {
		return walletId;
	}
	public void setwalletId(int walletId) {
		this.walletId = walletId;
	}
	public Date getorderDate() {
		return orderDate;
	}
	public void setorderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getquantityOrdered() {
		return quantityOrdered;
	}
	public void setquantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public String getorderStatus() {
		return orderStatus;
	}
	public void setorderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getbillAmount() {
		return billAmount;
	}
	public void setbillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String Comments) {
		this.Comments = Comments;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", vendorid=" + vendorid + ", customerid=" + customerid + ", menuid="
				+ menuid + ", walletId=" + walletId + ", orderDate=" + orderDate + ", quantityOrdered="
				+ quantityOrdered + ", orderStatus=" + orderStatus + ", billAmount=" + billAmount + ", Comments="
				+ Comments + "]";
	}
	
	
}