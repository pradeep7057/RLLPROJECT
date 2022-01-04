package com.java.restaurant;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class CanteenMain {
	
	static Scanner sc = new Scanner(System.in);
	static RestaurantDAO dao = new RestaurantDAO();
	static MenuDAO daoo = new MenuDAO();
	static CustomerDAO daooo = new CustomerDAO();
	static VendorDAO daoooo = new VendorDAO();
	
	public static void showVendor() {
		List<Vendor> vendor = null;
		try {
			vendor = daoooo.showVendor();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Vendor id : vendor) {
			System.out.println(id);
		}
	}
	public static void searchVendor() {
		int vendorid;
		System.out.println("Enter vendor Id  ");
		vendorid = sc.nextInt();
		Vendor vendor = null;
		try {
			vendor = daoooo.searchVendor(vendorid);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (vendor!=null) {
			System.out.println(vendor);
		} else {
			System.out.println("*** Record Not Found ***");
		}
		}
	public static void showCustomer() {
		List<Customer> customer = null;
		try {
			customer = daooo.showCustomer();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Customer id : customer) {
			System.out.println(id);
		}
	}
	public static void searchCustomer() {
	int customerid;
	System.out.println("Enter customer Id  ");
	customerid = sc.nextInt();
	Customer customer = null;
	try {
		customer = daooo.searchCustomer(customerid);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (customer!=null) {
		System.out.println(customer);
	} else {
		System.out.println("*** Record Not Found ***");
	}
	}
	
	public static void showMenu() {
		List<Menu> menu = null;
		try {
			menu = daoo.showMenu();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Menu id : menu) {
			System.out.println(id);
		}
	}
	
	public static void showRest() {
		List<Restaurant> rest = null;
		try {
			rest = dao.showRest();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Restaurant ld : rest) {
			System.out.println(ld);
		}
	}
	public static void searchMenu() {
	int menuid;
	System.out.println("Enter menu Id  ");
	menuid = sc.nextInt();
	Menu menu = null;
	try {
		menu = daoo.searchMenu(menuid);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (menu!=null) {
		System.out.println(menu);
	} else {
		System.out.println("*** Record Not Found ***");
	}
	}
	public static void searchRest() {
	int restaurantID;
	System.out.println("Enter restaurant Id  ");
	restaurantID = sc.nextInt();
	Restaurant rest = null;
	try {
		rest = dao.searchRest(restaurantID);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (rest!=null) {
		System.out.println(rest);
	} else {
		System.out.println("*** Record Not Found ***");
	}
	}
	public static void main(String[] args) throws ParseException {
		int choice;
		do {
			System.out.println(" O P T I O N S");
			System.out.println("---------------");
			System.out.println("1. show restaurant  ");
			System.out.println("2. search restaurant");
		    System.out.println("3. show MENU");
		    System.out.println("4. search menu");
		    System.out.println("5. show customer");
		    System.out.println("6. search restaurant");
		    System.out.println("7. show vendor");
		    System.out.println("8. search vendor");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				showRest();
				break;
			case 2 : 
				searchRest();
				break;
			case 3 :
				showMenu();
			break;
			case 4 :
				searchMenu();
				break;
			case 5 :
				showCustomer();
				break;
			case 6 :
				searchCustomer();
				break;
			case 7 :
				showVendor();
				break;
			case 8 :
				searchVendor();
				break;
				
				
			}
			return;
		} while(choice!=3);

	}



	

}
