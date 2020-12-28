package com.oop.bank;

public abstract class User extends Entity{

	public User(String name, Address address, int phoneNumber) {
		super(name, address, phoneNumber);
	}

}
