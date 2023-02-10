package com.careerit.jfs.basics.day18;

public class CurrentAccount extends Account {

  private double overDraft;

  public CurrentAccount(String name, double balance) {
    super(name, balance);
    overDraft = 10000;
  }

  @Override
  public void withdraw(double amount) {
    if (amount <= (balance + overDraft)) {
      balance -= amount;
    } else {
      System.out.println("Sorry! you don't have enough funds");
    }
  }
}
