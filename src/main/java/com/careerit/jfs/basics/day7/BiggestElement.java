package com.careerit.jfs.basics.day7;

public class BiggestElement {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 9, 8, 7, 6, 0, 9};
    System.out.println(biggest(arr));
    System.out.println(smallest(arr));
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
  public static int smallest(int[] arr) {
    int res = arr[0];
    for (int i=1;i<arr.length;i++) {
      if (res > arr[i]) {
        res = arr[i];
      }
    }
    return res;
  }
}
