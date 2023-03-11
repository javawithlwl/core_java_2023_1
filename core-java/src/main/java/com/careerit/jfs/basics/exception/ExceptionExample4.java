package com.careerit.jfs.basics.exception;

public class ExceptionExample4 {

  public static void main(String[] args) {
    try {
      m1();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println(e.getMessage());
    }
  }

  private static void m1() {
    m2();
  }

  private static void m2() {
    m3();
  }

  private static void m3() {
    m4();
  }

  private static void m4() {
    int res = 10 / 0;
    System.out.println(res);
  }


}
