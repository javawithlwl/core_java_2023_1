package com.careerit.jfs.basics.day4;

public class NXMPattern {

  public static void main(String[] args) {
    int n = 4;
    int m = 4;
    int count = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        System.out.print(count + " ");
        count++;
      }
      System.out.println();
    }
  }
}
