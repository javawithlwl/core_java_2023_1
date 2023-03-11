package com.careerit.jfs.basics.day6;

public class ExampleOnReturn {

  public static void main(String[] args) {

  }

  public static int sumOfNNaturalNumbers(int n) {
    int sum = 1;
    for (int i = 2; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

}
