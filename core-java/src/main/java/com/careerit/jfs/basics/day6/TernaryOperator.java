package com.careerit.jfs.basics.day6;

public class TernaryOperator {

  public static void main(String[] args) {
    int a = 10;
    int b = 30;
    int c = 15;
    System.out.println(biggest(a,b));
    System.out.println(biggest(a,b,c));

  }

  private static int biggest(int a, int b) {
    return (a > b) ? a : b;
  }

  private static int biggest(int a, int b, int c) {
    return (a > b && a > c) ? a : (b > c) ? b : c;
  }
}
