package com.oop.bank;

public class Credit extends Account{
    float interestRate;
    double creditLimit;
    double cashBackEarned;
    private double pay;

    public Credit(int accountNumber, String type, int pin, double balance) {
        super(accountNumber, type, pin, balance);
        this.cashBackEarned = 0.0;
        this.creditLimit = 0.0;
        this.interestRate = 0;

    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCashBackEarned() {
        return cashBackEarned;
    }

    public void setCashBackEarned(double cashBackEarned) {
        this.cashBackEarned = cashBackEarned;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "interestRate=" + interestRate +
                ", creditLimit=" + creditLimit +
                ", cashBackEarned=" + cashBackEarned +
                ", pay=" + pay +
                '}';
    }
}
