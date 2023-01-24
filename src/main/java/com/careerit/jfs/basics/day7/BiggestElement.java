package com.careerit.jfs.basics.day7;

public class BiggestElement {

  public static void main(String[] args) {
    int[] arr = new int[5];
    arr[0] = 1;
    arr[1] = 10;
    arr[2] = 100;
    arr[3] = 1000;
    arr[4] = 10000;

    System.out.println(arr.length);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println(arr[i]);
    }

    for (int i : arr) {
      System.out.println(i);
    }


  }

  public static int biggest(int a, int b, int c) {
    return (a > b && a > c) ? a : (b > c) ? b : c;
  }

  public static int biggest(int[] arr) {
    int big = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (big < arr[i]) {
        big = arr[i];
      }
    }
    return big;
  }
}
