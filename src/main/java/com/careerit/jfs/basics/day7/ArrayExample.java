package com.careerit.jfs.basics.day7;

public class ArrayExample {

  public static void main(String[] args) {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;
    for (int ele : arr) {
      sum += ele;
    }
    System.out.println("The sum of array element is :" + sum);

  }

}
