package com.oop.bank;

import java.util.ArrayList;

public class Bank extends Entity {
	public Bank(String name, Address address, int phoneNumber) {
		super(name, address, phoneNumber);
		// TODO Auto-generated constructor stub
	}


	private int institutionCode;
	ArrayList<User> userDB;
	

	@Override
	public String toString() {
		return null;
	}

}
