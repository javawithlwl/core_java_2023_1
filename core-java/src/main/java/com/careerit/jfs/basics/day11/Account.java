package com.careerit.jfs.basics.day11;

public class Account {

    private String accNumber;
    private String name;
    private double balance;

    public Account(String accNumber,String name,double balance){
            this.accNumber = accNumber;
            this.name = name;
            this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public void showDetails(){
      System.out.println(accNumber+","+name+","+balance);
    }

}
