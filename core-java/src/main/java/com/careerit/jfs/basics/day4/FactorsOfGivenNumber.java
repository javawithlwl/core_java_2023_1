package com.careerit.jfs.basics.day4;
import java.util.Scanner;
public class FactorsOfGivenNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num: ");
    int num = sc.nextInt();
    int count = 0;
    for(int i=1;i<=num;i++){
        if(num % i ==0){
          count++;
          System.out.print(i+" ");
        }
    }
    if(count == 2){
      System.out.println("\n"+num+" is a prime");
    }else{
      System.out.println("\n"+num+" is not a prime");
    }
  }
}
