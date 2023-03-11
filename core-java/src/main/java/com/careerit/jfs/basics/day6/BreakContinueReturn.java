package com.careerit.jfs.basics.day6;

public class BreakContinueReturn {


  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      if (i % 3 == 0 || i % 6 == 0) {
        break;
      }
      System.out.println(i);
    }

    for (int i = 1; i <= 3; i++) {
      for (int j = 1; i <= 3; j++) {
        if (i == j) {
          break;
        }
        System.out.println(i + " " + j);
      }
    }
    int sum = 0;
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= i; j++) {
        if (i == j) {
          break;
        }
        sum++;
      }
    }
    System.out.println(sum);

    sum = 0;
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        sum += j;
      }
    }

    System.out.println(sum);

    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        if (i == j) {
          continue;
        }
        System.out.println(i + " " + j);
      }
    }
    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 0) {
        continue;
      }
      if(i % 5 == 0){
        break;
      }
      System.out.println(i);
    }
  }
  // [1,2,3,4,5,9,8,7,6]  ele => 3
  public static int index(int[] arr,int ele){
      for(int i=0;i<arr.length;i++){
          if(arr[i]==ele){
            return i;
          }
      }
      System.out.println("Element is not found");
      return -1;
  }

  // If element is present in the given array return index otherwise return -1;
  private static int indexSearch(int[] arr, int ele) {
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == ele) {
        index = i;
        break;
      }
    }
    System.out.println("Element is not found");
    return index;
  }

  private static void printAllNonBinaryNumber(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0 || arr[i] == 1) {
        continue;
      }
      System.out.println(arr[i]);
    }
  }
}

//break => break from loop
//continue => will next iteration
//return => return from the method