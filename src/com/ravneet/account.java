package com.ravneet;

public class account {
    double balance;
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Balance is: " + balance);
    }
    void withdrawal(double amount){
        if (amount > balance){
            System.out.println("insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Balance is: " +balance);
        }
    }
    public double getBalance() {
        return balance;
    }
}
