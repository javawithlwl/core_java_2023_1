package com.careerit.jfs.basics.day18;

import java.util.Scanner;

public class AccountManager {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("-".repeat(50) + " Account Management System " + "-".repeat(50));

    AccountService accService = new AccountService();
    while (true) {
      System.out.println("-".repeat(100));
      System.out.println("1.Add Account 2.Withdraw 3.Deposit 4.Show Details 5.Account Summary 6.Export 7.Exit");
      System.out.println("Enter your choice :");
      int ch = sc.nextInt();
      sc.nextLine();
      switch (ch) {
        case 1:
          System.out.println("Enter the name :");
          String name = sc.nextLine();
          System.out.println("Enter the balance :");
          double balance = sc.nextDouble();
          sc.nextLine();
          System.out.println("Enter the account type");
          String accType = sc.nextLine();
          accService.createAccount(name, balance, accType);
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          System.out.println("Enter the account number :");
          int accNumber = sc.nextInt();
          accService.showAccountDetails(accNumber);
          break;
        case 5:
          break;
        case 6:
          break;
        case 7:
          System.out.println("Thank for using AMS application");
          System.exit(0);
        default:
          System.out.println("Please Enter Valid Choice");
      }
    }

  }
}
