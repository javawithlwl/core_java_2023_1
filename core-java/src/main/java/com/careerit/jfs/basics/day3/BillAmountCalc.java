package com.careerit.jfs.basics.day3;

import java.util.Scanner;

public class BillAmountCalc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name :");
    String name = sc.nextLine();
    System.out.println("Enter the bill amount");
    float billAmount = sc.nextFloat();
    float discount = 0.0f;
    if(billAmount >= 5000){
        discount = billAmount * 0.1f;
    }else{
        discount = billAmount * 0.05f;
    }
    float netAmount = billAmount - discount;
    System.out.println("Dear "+name+",");
    System.out.println("\nBill amount :"+billAmount+" Discount amount :"+discount+" and Net amount :"+netAmount);
    System.out.println("\n\nThank you");
  }
}
