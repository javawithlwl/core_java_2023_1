package com.careerit.jfs.basics.day18;

import lombok.Getter;
import lombok.Setter;

import java.util.StringJoiner;

@Getter
@Setter
public class Account {

    int accNumber;
    String name;
    double balance;

    public Account(String name, double balance) {
        this.accNumber = GenerateAccNumber.getNewNumber();
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
