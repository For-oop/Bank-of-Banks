package com.oop.bank;

public class Account {
    private int accountNumber;
    private String type;
    private int pin;
    private double balance;

    public Account(int accountNumber, String type, int pin, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
        this.type = type;

    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPin() {
        return this.pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAvailable(){
        return 0.0;
    }

    public double updateBalance() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", type='" + type + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }

}
