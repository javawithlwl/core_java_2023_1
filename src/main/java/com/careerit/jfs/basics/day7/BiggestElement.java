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

  public static int smallest(int[] arr) {
    int small = arr[0];
    for (int i = 1; i <= arr.length; i++) {
      if (small > arr[i]) {
        small = arr[i];
      }
    }
    return small;
  }

  public static boolean isPalindrome(int[] arr) {
    boolean flag = true;
    for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
      if (arr[i] != arr[j]) {
        flag = false;
        break;
      }
    }
    return flag;
  }

  // If element present return index otherwise return -1
  public static int indexOf(int[] arr, int ele) {
    for (int i = 0; i < arr.length; i++) {
      if (ele == arr[i]) {
        return i;
      }
    }
    return -1;
  }

  // If all element present then return true otherwise return false
  public static boolean search(int[] arr, int a, int b, int c) {
    return indexOf(arr, a) != -1 && indexOf(arr, b) != -1 && indexOf(arr, c) != -1;
  }

  //  If value of n is 10 => 2,3,5,7,11,13,17,19,23,29
  public static int[] generatePrimes(int n) {
    int[] temp = new int[n];
    int count = 0;
    for (int i = 2; ; i++) {
      if (isPrime(i)) {
        temp[count++] = i;
      }
      if (count == n) {
        break;
      }
    }
    return temp;
  }
  // 2 20 => 2,3,5,7,11,13,17,19 =>8
  public static int[] getPrimeInRange(int lb,int ub){
      int[] temp = new int[primeCount(lb,ub)];
      int c = 0;
      for(int i=lb;i<=ub;i++){
          if(isPrime(i)){
              temp[c++] = i;
          }
      }
      return temp;
  }
  public static int primeCount(int lb,int ub){
      int count=0;
      for(int i=lb;i<=ub;i++){
          if(isPrime(i)){
            count++;
          }
      }
      return count;
  }
  private static boolean isPrime(int num) {
    if (num < 0 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

}
