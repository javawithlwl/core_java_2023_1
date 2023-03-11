package com.careerit.jfs.basics.day2;

import java.util.Scanner;

public class ProfitOrLossExample {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Buying price :");
    double buyingPrice = sc.nextDouble();
    System.out.println("Enter the Selling price :");
    double sellingPrice = sc.nextDouble();
    double res = sellingPrice - buyingPrice;
    if(res < 0){
      System.out.println("You incurred loss of "+res);
    }else if(res > 0){
      System.out.println("You made a profit of "+res);
    }else{
      System.out.println("No loose No Profit");
    }



  }
}
