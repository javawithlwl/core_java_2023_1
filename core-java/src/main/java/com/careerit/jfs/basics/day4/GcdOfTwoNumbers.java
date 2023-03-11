package com.careerit.jfs.basics.day4;
import java.time.LocalDate;
public class GcdOfTwoNumbers {
  public static void main(String[] args) {
    int num1 = 40;
    int num2 = 24;
    int res = gcd(num1,num2);
    System.out.println("GCD of "+num1+" and "+num2+" is "+res);

  }
  public static boolean isEven(int num){
      if(num % 2 ==0){
          return true;
      }
      return false;
  }
  public static void showDate(){
    System.out.println(LocalDate.now());
  }
  public static LocalDate getSystemDate(){
    return LocalDate.now();
  }
  public static void showTable(int num){
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " * "+ i+" = "+(num*i));
    }
  }
  public static int gcd(int a,int b){
    for (; a != b; ) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }
}
