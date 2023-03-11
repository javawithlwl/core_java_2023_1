package com.careerit.jfs.basics.day4;

import java.util.Scanner;
public class SumOfEvenNumberInRange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of lb: ");
    int lb = sc.nextInt();
    System.out.println("Enter the value of ub: ");
    int ub = sc.nextInt();
    int evenSum = 0;
    int oddSum = 0;
    for (int i = lb; i <= ub; i++) {
        if(i % 2 == 0){
            evenSum += i;
        }else{
          oddSum += i;
        }
    }
    System.out.println("Sum of even numbers between "+lb+" and "+ub+" is "+evenSum);
    System.out.println("Sum of odd numbers between "+lb+" and "+ub+" is "+oddSum);
  }
}
