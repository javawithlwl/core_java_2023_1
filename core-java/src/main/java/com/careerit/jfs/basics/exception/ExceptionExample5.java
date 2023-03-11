package com.careerit.jfs.basics.exception;

import java.io.IOException;
import java.util.Scanner;

class One{

    void m1() throws Exception{}

}
class Two extends  One{
    void m1(){}

}

public class ExceptionExample5 {

  public static void main(String[] args) {

    Scanner scn  = new Scanner(System.in);
    System.out.println("Enter the age :");
    int age = scn.nextInt();
    if(age < 0){
        throw new IllegalArgumentException("Age can't be -ve number");
    }
  }
}
