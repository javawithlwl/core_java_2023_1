package com.careerit.jfs.basics.day3;

import java.util.Scanner;

public class BiggestOfTwoNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value a: ");
    int a = sc.nextInt();
    System.out.println("Enter the value b: ");
    int b = sc.nextInt();
    int big;
    if(a > b){
        big = a;
    }else{
        big = b;
    }
    System.out.println("Biggest of "+a+" and "+b+" is "+big);
  }
}
