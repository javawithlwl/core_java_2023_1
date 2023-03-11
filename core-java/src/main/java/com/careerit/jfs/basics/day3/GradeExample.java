package com.careerit.jfs.basics.day3;

import java.util.Scanner;

public class GradeExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the score (1-10) only :");
    int score = sc.nextInt();
    if(score>=0 && score <=10) {
      if (score >= 9 && score <= 10) {
        System.out.println("Score " + score + " and Grade \"A\"");
      } else if (score >= 7 && score <= 8) {
        System.out.println("Score " + score + " and Grade \"B\"");
      } else if (score >= 5 && score <= 6) {
        System.out.println("Score " + score + " and Grade \"C\"");
      } else {
        System.out.println("Score " + score + " and Grade \"D\"");
      }
    }else{
      System.out.println("Invalid score, please enter score (1-10) only");
    }
  }
}
