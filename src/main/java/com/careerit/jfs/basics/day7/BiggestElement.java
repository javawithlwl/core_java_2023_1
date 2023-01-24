package com.careerit.jfs.basics.day7;

public class BiggestElement {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 9, 8, 7, 6, 0, 9};
    System.out.println(biggest(arr));
  }

  public static int biggest(int[] arr) {
    int big = arr[0];
    for (int ele : arr) {
      if (big < ele) {
        big = ele;
      }
    }
    return big;
  }
}
