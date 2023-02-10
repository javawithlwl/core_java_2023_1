package com.careerit.jfs.basics.day18;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

  private List<Account> accountList = new ArrayList<>();

  public void createAccount(String name, double balance, String accType) {
    Account acc;
    if (accType.equalsIgnoreCase("savings")) {
      acc = new SavingsAccount(name, balance);
    } else if (accType.equalsIgnoreCase("current")) {
      acc = new CurrentAccount(name, balance);
    } else {
      throw new IllegalArgumentException("Account type is not valid");
    }
    System.out.println("Account is created with id : " + acc.getAccNumber());
    accountList.add(acc);

  }

  public void withDraw(int accNumber, double amount) {
    int index = indexOf(accNumber);
    if (index != -1) {
      Account account = accountList.get(index);
      account.withdraw(amount);
    } else {
      System.out.println("Sorry! account with id " + accNumber + " is not found");
    }
  }

  public void deposit(int accNumber, double amount) {
    int index = indexOf(accNumber);
    if (index != -1) {
      Account account = accountList.get(index);
      account.deposit(amount);
    } else {
      System.out.println("Sorry! account with id " + accNumber + " is not found");
    }
  }

  public void showAccountDetails(int accNumber) {
    int index = indexOf(accNumber);
    if (index != -1) {
      Account account = accountList.get(index);
      String accountType = account instanceof CurrentAccount ? "current" : "savings";
      System.out.println("Account number   :" + account.getAccNumber());
      System.out.println("Name             :" + account.getName());
      System.out.println("Balance          :" + account.getBalance());
      System.out.println("Account Type     :" +accountType);
    } else {
      System.out.println("Sorry! account with id " + accNumber + " is not found");
    }

  }
  // 1. No of savings account and its total balance
  // 2. No of current accounts and its total balance
  public void summaryDetails(){

  }
  // Write all account details to csv file
  // 1001,Satya,5000,savings
  // 1002,Infy,1000,current
  public void export(){

  }

  private int indexOf(int accNumber) {
    for (int i = 0; i < accountList.size(); i++) {
      if (accountList.get(i).getAccNumber() == accNumber) {
        return i;
      }
    }
    return -1;
  }
}
