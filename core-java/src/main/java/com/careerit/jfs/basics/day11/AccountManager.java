package com.careerit.jfs.basics.day11;

public class AccountManager {

  public static void main(String[] args) {

    Account acc1 = new Account("SB1001", "Satya", 45000);
    Account acc2 = new Account("SB1091", "Naresh", 55000);
    Account acc3 = new Account("SB1089", "Rajesh", 25000);

    acc1.showDetails();
    acc2.showDetails();
    acc3.showDetails();

    acc1.deposit(5000);
    acc1.showDetails();
    acc2.showDetails();
    acc3.showDetails();
  }
}
