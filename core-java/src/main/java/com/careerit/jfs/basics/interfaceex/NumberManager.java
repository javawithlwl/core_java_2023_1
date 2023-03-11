package com.careerit.jfs.basics.interfaceex;

import java.time.LocalDate;

interface NumberOperations {

  boolean isPrime(int num);

  int primeCount(int lb, int ub);

  default int[] primeInRange(int lb, int ub) {
    int count = primeCount(lb, ub);
    int[] arr = new int[count];
    int c = 0;
    for (int i = lb; i <= ub; i++) {
      if (isPrime(i)) {
        arr[c++] = i;
      }
    }
    return arr;
  }
  private boolean isEven(int num){
    return num % 2 == 0;
  }
  static LocalDate getDate(){
    return LocalDate.now();
  }
}

class PrimeNumbers implements NumberOperations {

  @Override
  public boolean isPrime(int num) {
    return false;
  }

  @Override
  public int primeCount(int lb, int ub) {
    return 0;
  }
}

class PrimeWithLatestCode implements NumberOperations {

  @Override
  public boolean isPrime(int num) {
    return false;
  }

  @Override
  public int primeCount(int lb, int ub) {
    return 0;
  }
}

public class NumberManager {

  public static void main(String[] args) {

        NumberOperations obj = new PrimeNumbers();

  }
}
