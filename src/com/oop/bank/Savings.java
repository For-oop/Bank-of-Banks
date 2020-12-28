package com.oop.bank;

public class Savings extends Debit {
    float transactionFee;
    float rate;


    public Savings(int pin, int accountNumber, String type, double balance) {
        super(pin, accountNumber, type, balance);
        this.transactionFee = 0;
        this.rate = 0;
    }

    public float getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(float transactionFee) {
        this.transactionFee = transactionFee;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Savings{" +
                "transactionFee=" + transactionFee +
                ", rate=" + rate +
                '}';
    }
}
