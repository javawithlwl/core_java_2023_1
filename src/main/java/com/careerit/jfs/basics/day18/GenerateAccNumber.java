package com.careerit.jfs.basics.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateAccNumber {

  private static int[] arr = new int[]{1,2,3,4,5,6,7,8,9};

  public static int getNewNumber() {
    int num1 = ThreadLocalRandom.current().nextInt(0,arr.length);
    int num2 = ThreadLocalRandom.current().nextInt(0,arr.length);
    int newNum = arr[num1]+ThreadLocalRandom.current().nextInt(10000, 99981)+arr[num2] ;
    return newNum;
  }

}
