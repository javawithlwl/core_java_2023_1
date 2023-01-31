package com.careerit.jfs.basics.day10;

public class FactorialOfNumber {
  public static void main(String[] args) {
    System.out.println(fact(6));
    System.out.println(gcd(10, 15));
    showTable(19);
  }

  private static int fact(int num) {
    if (num == 0 || num == 1) {
      return 1;
    }
    return num * fact(num - 1);
  }

  private static int gcd(int num1, int num2) {
    if (num1 == num2) {
      return num1;
    }
    if (num1 > num2) {
      return gcd(num1 - num2, num2);
    } else {
      return gcd(num1, num2 - num1);
    }
  }

  public static void showTable(int num) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " * " + i + " = " + (num * i));
    }
  }
}

