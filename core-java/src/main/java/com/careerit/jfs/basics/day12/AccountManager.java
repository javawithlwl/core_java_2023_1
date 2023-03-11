package com.careerit.jfs.basics.day12;

class Account {

  private Long accNum;
  private String name;
  private double balance;

  public Account(Long accNum, String name, double balance) {
    this.accNum = accNum;
    this.name = name;
    this.balance = balance;
  }

  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      System.out.println(String.format("Your acc %s debited with %s balance %s", maskAccNumber(accNum), amount, balance));
    } else {
      System.out.println("Sorry! insufficient funds your balance is " + balance);
    }
  }

  public void deposit(double amount) {
    balance += amount;
    balance -= amount;
    System.out.println(String.format("Your acc %s credited with %s balance %s", maskAccNumber(accNum), amount, balance));
  }


  public void showDetails() {
    System.out.println("Acc number :" + maskAccNumber(accNum));
    System.out.println("Name       :" + name);
    System.out.println("Balance    :" + balance);
  }
  private String maskAccNumber(Long accNumber){
      String strAcc = accNumber.toString();
      return "XXXXXX"+strAcc.substring(strAcc.length()-3);
  }

  public Long getAccNum() {
    return accNum;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }
}

public class AccountManager {

  public static void main(String[] args) {

    Account acc1 = new Account(3036394299L, "Krish", 45000);
    Account acc2 = new Account(3036394289L, "Manoj", 59000);
    Account acc3 = new Account(3036394259L, "Naresh", 5000);
    Account acc4 = new Account(3036394269L, "Mahesh", 9000);
    Account acc5 = new Account(3036394249L, "Jayesh", 5000);
    Account acc6 = new Account(3036394239L, "Ramesh", 9000);
    Account[] arr = new Account[]{acc1, acc2, acc3, acc4, acc5, acc6};
    for (Account acc : arr) {
      acc.showDetails();
      System.out.println("-".repeat(100));
    }
    Account maxBalanceAcc = getMaxBalanceAccount(arr);
    maxBalanceAcc.showDetails();
  }
  private static Account getMaxBalanceAccount(Account[] arr){
        double max = maxBalance(arr);
        for(Account acc:arr){
            if(acc.getBalance() == max){
              return acc;
            }
        }
        return null;
  }
  private static double maxBalance(Account[] arr){
        double maxAmount = arr[0].getBalance();
        for(int i=1;i<arr.length;i++){
            Account acc = arr[i];
            if(acc.getBalance() > maxAmount){
                maxAmount = acc.getBalance();
            }
        }
        return maxAmount;
  }
  private static double totalBalance(Account[] arr){
      double sum = 0;
      for(Account acc:arr){
          sum += acc.getBalance();
      }
      return sum;
  }
  private static String[] getNameOfAccHolder(Account[] arr){
      String[] names = new String[arr.length];
      int i =0;
      for(Account acc:arr){
        names[i++] = acc.getName();
      }
      return names;
  }
}
