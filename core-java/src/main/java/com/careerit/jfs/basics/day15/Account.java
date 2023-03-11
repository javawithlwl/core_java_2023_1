package com.careerit.jfs.basics.day15;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.StringJoiner;

@Getter
@Setter
@AllArgsConstructor
public class Account {
    int accNumber;
    String name;
    double balance;

  @Override
  public String toString() {
    return new StringJoiner(", ", Account.class.getSimpleName() + "[", "]")
        .add("accNumber=" + accNumber)
        .add("name='" + name + "'")
        .add("balance=" + balance)
        .toString();
  }

  public static void main(String[] args) {

        Account account = new Account(1001,"Satya",475000);
        System.out.println(account);
        System.out.println(account.toString());


  }
}
