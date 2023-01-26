package com.careerit.jfs.basics.day8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

  public static void main(String[] args) {

    int generateNumber = ThreadLocalRandom.current().nextInt(1, 7);
    Scanner sc = new Scanner(System.in);
    for (int i = 1; i <= 3; i++) {
      System.out.println("Guess a number in range (1-6) :");
      int guessedNumber = sc.nextInt();
      if (guessedNumber == generateNumber) {
        System.out.println("Congratulation you guessed number in "+i+" attempt(s)");
        break;
      } else {
        System.out.println("Sorry! your guess is wrong.");
        if (i == 3) {
          System.out.println("You have reached max no of attempts. The number is " + generateNumber);
        }
      }
    }
  }
}
