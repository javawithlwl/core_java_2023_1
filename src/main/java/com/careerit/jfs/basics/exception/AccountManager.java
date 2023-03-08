package com.careerit.jfs.basics.exception;

public class AccountManager {
  enum AccountErrorCodes{
    ACCOUNT_NOT_FOUND, ACCOUNT_LOCKED, INSUFFICIENT_FUND
  }

  public static void main(String[] args) {

        try{
          showAccountDetails("SB001");
        }catch (AccountException e){
          System.out.println(e);
        }
  }
  public static void showAccountDetails(String accNumber){
      // Logic
    throw new AccountException("Account not found, Account number"+accNumber,"ACCOUNT_NOT_FOUND");
  }
}
