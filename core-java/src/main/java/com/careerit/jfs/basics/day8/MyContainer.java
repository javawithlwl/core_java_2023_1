package com.careerit.jfs.basics.day8;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MyContainer {
  public static void main(String[] args) {
    int[] arr1 = generatePrimes(10);
    int[] arr2 = getRandomNumbers(10);
    // copy arr1 and arr2 into arr3
    int[] arr3 = new int[arr1.length + arr2.length];
    System.arraycopy(arr1, 0, arr3, 0, arr1.length);
    System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
    System.out.println(Arrays.toString(arr3));
    int[] res = new int[arr3.length];
    int c=0;
    for(int ele:arr3){
        if(!isFound(res,c,ele)){
          res[c++] = ele;
        }
    }
    int[] finalRes = new int[c];
    System.arraycopy(res,0,finalRes,0,c);
    System.out.println(Arrays.toString(finalRes));
  }
  private static boolean isFound(int[] arr,int l,int key){
      for(int i=0;i<l;i++){
        if(arr[i]==key){
          return true;
        }
      }
      return false;
  }

  private static int[] getRandomNumbers(int n) {
    int[] temp = new int[n];
    for (int i = 0; i < n; i++) {
      temp[i] = ThreadLocalRandom.current().nextInt(1, 20);
    }
    return temp;
  }

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
