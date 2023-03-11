package com.careerit.jfs.basics.day3;

import java.util.Scanner;

public class BiggestOfThreeNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value a: ");
    int a = sc.nextInt();
    System.out.println("Enter the value b: ");
    int b = sc.nextInt();
    System.out.println("Enter the value c: ");
    int c = sc.nextInt();
    int big;
    if (a > b && a > c) {
      big = a;
    } else if (b > c) {
      big = b;
    } else {
      big = c;
    }
    System.out.println("Biggest of " + a + "," + b + " and " + c + " is " + big);
  }
}
