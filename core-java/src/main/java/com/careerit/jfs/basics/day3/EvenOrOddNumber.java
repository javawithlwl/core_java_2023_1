package com.careerit.jfs.basics.day3;

import java.util.Scanner;

public class EvenOrOddNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num: ");
    int num = sc.nextInt();
    if(num % 2 == 0){
      System.out.println("Given number "+num+" is Even");
    }else{
      System.out.println("Given number "+num+" is Odd");
    }

  }
}
