package com.careerit.jfs.basics.day7;

import java.util.Arrays;

public class ArrayExample {

  public static void main(String[] args) {

    int[] arr1 = new int[]{1, 2, 3, 14, 15, 16};
    int[] arr2 = new int[]{11, 12, 13, 4, 5, 6};

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));

    int[] arr3 = new int[arr1.length+arr2.length];

    System.arraycopy(arr1,0,arr3,0,arr1.length);
    System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
    Arrays.sort(arr3);
    System.out.println(Arrays.toString(arr3));


  }

}
