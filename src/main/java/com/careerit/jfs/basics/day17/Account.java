package com.careerit.jfs.basics.day17;

import java.util.StringJoiner;

public class Account {

    int accNumber;
    String name;
    double balance;

    public Account(int accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Sorry! you don't have enough funds");
        }
    }
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Account.class.getSimpleName() + "[", "]")
            .add("accNumber=" + accNumber)
            .add("name='" + name + "'")
            .add("balance=" + balance)
            .toString();
    }
}
