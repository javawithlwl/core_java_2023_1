package com.careerit.jfs.basics.json;

public class TransactionManager {

  public static void main(String[] args) {
    CurrencyService currencyService = new CurrencyService();
    System.out.println(currencyService.findByCurrencyCode("USD"));
    TransactionService txService = new TransactionService();
    txService.getTransactionDetails().stream().forEach(ele->{
      System.out.println(ele);
    });
  }
}
