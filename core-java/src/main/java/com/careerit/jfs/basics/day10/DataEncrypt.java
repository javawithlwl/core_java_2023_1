package com.careerit.jfs.basics.day10;

public class DataEncrypt {

  public static void main(String[] args) {

    String data = "Satya,13036394299,-1000:Naresh,13036395499,10000:Rajesh,13036394244,-4000:Charan,13036394399,3000";
    sendTransactionAlert(data);
  }

  private static void sendTransactionAlert(String data) {
    //Hello Satya, Your account ********299 credit with amount {}
    String[] transactionDetails = data.split(":");
    for (String transaction : transactionDetails) {
      String[] arr = transaction.split(",");
      String name = arr[0];
      String accNumber = arr[1];
      double amount = Double.parseDouble(arr[2]);
      String transactionType = null;
      if (amount < 0) {
        transactionType = "Debited";
        amount = -amount;
      } else {
        transactionType = "Credited";
      }
      StringBuilder sb = new StringBuilder("Hello ")
          .append(name).append(", ")
          .append("Your account ")
          .append(maskAccount(accNumber)).append(" ")
          .append(transactionType).append(" ")
          .append(" with amount ")
          .append(amount)
          .append(".");
      System.out.println(sb.toString());
      System.out.println("-".repeat(100));
    }
  }

  private static String maskAccount(String accNumber) {
    return "********" + accNumber.substring(accNumber.length() - 3);
  }
}
