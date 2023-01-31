package com.careerit.jfs.basics.day10;

public class Demo {
  public static void main(String[] args) {
    int num = 98451;
    while (num > 9) {
      int sum = 0;
      while (num != 0) {
        sum += num % 10;
        num = num / 10;
      }
      num = sum;
    }
    System.out.println(num);
  }
}
