package com.oop.bank;

public class Debit extends Account{
    private double deposit;
    private double withdraw;
    private double transfer;

    public Debit(int pin, int accountNumber, String type, double balance) {
        super(accountNumber,type,pin,balance);
        this.deposit = 0.0;
        this.withdraw = 0.0;
        this.transfer = 0.0;


    }

    public double getDeposit() {
        return this.deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return this.withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getTransfer() {
        return this.transfer;
    }

    public void setTransfer(double transfer) {
        this.transfer = transfer;
    }

    @Override
    public String toString() {
        return "Debit{" +
                "deposit=" + deposit +
                ", withdraw=" + withdraw +
                ", transfer=" + transfer +
                '}';
    }
}
