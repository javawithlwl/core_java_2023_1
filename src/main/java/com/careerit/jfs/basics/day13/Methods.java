package com.careerit.jfs.basics.day13;

public class Methods {
  private String message = "Method example";

  public int add(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Methods obj = new Methods();
    System.out.println(obj.message);
    int res = obj.add(5,8);
    System.out.println("Result is :"+res);
  }
}
