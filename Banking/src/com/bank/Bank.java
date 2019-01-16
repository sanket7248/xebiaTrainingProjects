package com.bank;

public class Bank {
	public User readUserFromAccounts(int userId) {
		Address add = new Address();
		add.setAreaCode(1.45);
		add.setLocation("M. G. Road");
		add.setNum(111);
		User user = new User();
		user.setAddress(add);
		user.setIncome(1500000);
		user.setSecCode("2474");
		user.setUserId(123);
		System.out.println("Returnin new user with - " + user.getUserId());
		return user;
	}
	
	public Address getLocationForUser(User user) {
		System.out.println("Returning address for user -"+user.getUserId());
		return user.getAddress();
	}

}
