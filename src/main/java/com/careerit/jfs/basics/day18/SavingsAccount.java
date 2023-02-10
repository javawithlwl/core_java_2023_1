package com.careerit.jfs.basics.day18;

public class SavingsAccount extends Account {
  private double minBalance;

  public SavingsAccount(String name, double balance) {
    super(name, balance);
    minBalance = 1000;
  }
  @Override
  public void withdraw(double amount) {
    if (amount <= (balance - minBalance)) {
      balance -= amount;
    } else {
      System.out.println("Sorry! you don't have enough funds");
    }
  }
}
