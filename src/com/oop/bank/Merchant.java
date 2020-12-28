package com.oop.bank;

public class Merchant extends User{
	private float transactionFee;
	private double batch;

	public Merchant(String name, Address address, int phoneNumber) {
		super(name, address, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
