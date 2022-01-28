package com.example.demo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersDAO {
	@Autowired
    JdbcTemplate jdbcTemplate;
	
    public Orders[] showCOrders(int customerid) {
	String cmd = "select * from Orders where customerid=? ";	
	List<Orders> ordersList=jdbcTemplate.query(cmd, new Object[] {customerid}, new RowMapper() {

		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			Orders orders = new Orders();
			orders.setorderid(rs.getInt("orderid"));
			orders.setvendorid(rs.getInt("vendorid"));
			orders.setcustomerid(rs.getInt("customerid"));
			orders.setmenuid(rs.getInt("menuid"));
			orders.setwalletId(rs.getInt("walletId"));
			orders.setorderDate(rs.getDate("orderDate"));
			orders.setquantityOrdered(rs.getInt("quantityOrdered"));
			orders.setorderStatus(rs.getString("orderStatus"));
			orders.setbillAmount(rs.getInt("billAmount"));
			orders.setComments(rs.getString("Comments"));
			return orders;
		}
	});
	return ordersList.toArray(new Orders[ordersList.size()]);
    }
    
    public Orders[] showCPOrders(int customerid) {
    	String cmd = "select * from Orders where customerid=? and orderStatus='PENDING'";	
    	List<Orders> ordersList=jdbcTemplate.query(cmd, new Object[] {customerid}, new RowMapper() {

    		@Override
    		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
    		
    			Orders orders = new Orders();
    			orders.setorderid(rs.getInt("orderid"));
    			orders.setvendorid(rs.getInt("vendorid"));
    			orders.setcustomerid(rs.getInt("customerid"));
    			orders.setmenuid(rs.getInt("menuid"));
    			orders.setwalletId(rs.getInt("walletId"));
    			orders.setorderDate(rs.getDate("orderDate"));
    			orders.setquantityOrdered(rs.getInt("quantityOrdered"));
    			orders.setorderStatus(rs.getString("orderStatus"));
    			orders.setbillAmount(rs.getInt("billAmount"));
    			orders.setComments(rs.getString("Comments"));
    			return orders;
    		}
    	});
    	return ordersList.toArray(new Orders[ordersList.size()]);
    }
    
    public Orders[] showVPOrders(int vendorid) {
    	String cmd = "select * from Orders where vendorid=? and orderStatus='PENDING'";	
    	List<Orders> ordersList=jdbcTemplate.query(cmd, new Object[] {vendorid}, new RowMapper() {

    		@Override
    		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
    			
    			Orders orders = new Orders();
    			orders.setorderid(rs.getInt("orderid"));
    			orders.setvendorid(rs.getInt("vendorid"));
    			orders.setcustomerid(rs.getInt("customerid"));
    			orders.setmenuid(rs.getInt("menuid"));
    			orders.setwalletId(rs.getInt("walletId"));
    			orders.setorderDate(rs.getDate("orderDate"));
    			orders.setquantityOrdered(rs.getInt("quantityOrdered"));
    			orders.setorderStatus(rs.getString("orderStatus"));
    			orders.setbillAmount(rs.getInt("billAmount"));
    			orders.setComments(rs.getString("Comments"));
    			return orders;
    		}
    	});return ordersList.toArray(new Orders[ordersList.size()]);
    }
    
    public Orders[] showVOrders(int vendorid) {
    	String cmd = "select * from Orders where vendorid=? ";	
    	List<Orders> ordersList=jdbcTemplate.query(cmd, new Object[] {vendorid}, new RowMapper() {

    		@Override
    		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
    			
    			Orders orders = new Orders();
    			orders.setorderid(rs.getInt("orderid"));
    			orders.setvendorid(rs.getInt("vendorid"));
    			orders.setcustomerid(rs.getInt("customerid"));
    			orders.setmenuid(rs.getInt("menuid"));
    			orders.setwalletId(rs.getInt("walletId"));
    			orders.setorderDate(rs.getDate("orderDate"));
    			orders.setquantityOrdered(rs.getInt("quantityOrdered"));
    			orders.setorderStatus(rs.getString("orderStatus"));
    			orders.setbillAmount(rs.getInt("billAmount"));
    			orders.setComments(rs.getString("Comments"));
    			return orders;
    		}
    	});return ordersList.toArray(new Orders[ordersList.size()]);
    }
    
    public Wallet searchBywalletId(int walletId) {
		String cmd = "select * from wallet where walletId=?";
		List<Wallet> walletList = jdbcTemplate.query(cmd, 
				new Object[] {walletId}, new RowMapper(){
					@Override
					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
						Wallet wallet = new Wallet();
						wallet.setWalletId(rs.getInt("walletId"));
						wallet.setCustomerId(rs.getInt("customerid"));
						wallet.setWallettype(rs.getString("wallettype"));
						wallet.setAmount(rs.getInt("amount"));
						return wallet;
					}
		});
		return walletList.get(0);
		
	}

	public Menu searchMenu(int menuid)  {
		String cmd = "select * from menu where menuid=?";
		List<Menu> menuList = jdbcTemplate.query(cmd, 
				new Object[] {menuid}, new RowMapper(){
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
		return menuList.get(0);
	}

	public Orders searchOrder(int orderId) {
		String cmd = "select * from orders where orderid=?";
		List<Orders> ordersList = jdbcTemplate.query(cmd, 
				new Object[] {orderId},
				new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Orders orders = new Orders();
    			orders.setorderid(rs.getInt("orderid"));
    			orders.setvendorid(rs.getInt("vendorid"));
    			orders.setcustomerid(rs.getInt("customerid"));
    			orders.setmenuid(rs.getInt("menuid"));
    			orders.setwalletId(rs.getInt("walletId"));
    			orders.setorderDate(rs.getDate("orderDate"));
    			orders.setquantityOrdered(rs.getInt("quantityOrdered"));
    			orders.setorderStatus(rs.getString("orderStatus"));
    			orders.setbillAmount(rs.getInt("billAmount"));
    			orders.setComments(rs.getString("Comments"));
    			return orders;
			}
		});
		return ordersList.get(0);
		
	}
	public String acceptOrRejectOrder(int orderid, int vendorid, String status) {
		Orders order = searchOrder(orderid);
		if (order.getvendorid()==vendorid) {
			if (status.toUpperCase().equals("YES")) {
				String cmd = "Update orders set orderStatus='ACCEPTED' "
						+ " WHERE orderid=?";
				jdbcTemplate.update(cmd, new Object[] {orderid});
				return "Order Approved Successfully...";
			} else {
				String cmd = "Update orders set orderStatus='REJECTED' "
						+ " WHERE orderid=?";
				jdbcTemplate.update(cmd,new Object[] {orderid});
				cmd = "Update Wallet set Amount=Amount+? where walletId=?";
				jdbcTemplate.update(cmd, new Object[] {order.getbillAmount(), order.getwalletId()});
				return "Order Rejected Amount Refunded...";
			}
		} 
		return "You are unauthorized vendor...";
	}
	public String deductBalance(int walletId, int  billAmount) {
		String cmd = "update wallet set amount=amount-? where walletId=?";
		jdbcTemplate.update(cmd, new Object[] { billAmount,walletId});
		return "Amount Deducted...";
	}

	public String placeOrder(Orders order)  {
		int oid = generateorderId();
		order.setorderStatus("PENDING");
		java.util.Date today = new Date();
		java.sql.Date dbDate = new java.sql.Date(today.getTime());
		order.setorderDate(dbDate);
		Menu menu = searchMenu(order.getmenuid());
		int price = menu.getPrice();
		int billAmount = order.getquantityOrdered() * price;
		Wallet wallet = searchBywalletId(order.getwalletId());
		int amount = wallet.getAmount();
		if (amount - billAmount > 0) {
			order.setbillAmount(billAmount);
			order.setorderid(oid);
			String cmd = "insert into Orders(orderid,vendorid,customerid,menuid,"
					+ "walletId,orderDate,quantityOrdered,orderStatus, billAmount,Comments) "
					+ "values(?,?,?,?,?,?,?,?,?,?)";
			jdbcTemplate.update(cmd, new Object[] {
				order.getorderid(), order.getvendorid(),
				order.getcustomerid(),order.getmenuid(),
				order.getwalletId(), order.getorderDate(),
				order.getquantityOrdered(),order.getorderStatus(),
				order.getbillAmount(),order.getComments()
			});
			deductBalance(order.getwalletId(),billAmount);
			return "Order Placed Successfully...Wallet Balance Deducted...";
		}
		return "Insufficient Funds...";
		//order.set billAmount(billAmount);
	}
	
	public int generateorderId()  {
		String cmd = "select case when max(orderId) is NULL THEN 1"
				+ " else max(orderId)+1 end oid from orders";
		List<Object> oid = jdbcTemplate.query(cmd, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Object ob = rs.getInt("oid");
				return ob;
			}
		});
		return (Integer)oid.get(0);
	}
}