package com.careerit.jfs.basics.day3;

import java.util.Scanner;

public class SumOfNaturalNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of N ");
    int n = sc.nextInt();
    int sum = (n * (n + 1))/2;
    System.out.println("The sum of first "+n+" natural number is "+sum);
  }

}
