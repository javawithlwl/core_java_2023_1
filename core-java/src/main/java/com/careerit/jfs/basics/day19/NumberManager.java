package com.careerit.jfs.basics.day19;

import java.util.ArrayList;
import java.util.List;

abstract class PrimeGenerator {
  public final List<Integer> generatePrime(int lb, int ub) {
    List<Integer> list = new ArrayList<>();
    for (int i = lb; i <= ub; i++) {
      if (isPrime(i)) {
        list.add(i);
      }
    }
    return list;
  }
  public final  List<Integer> generate(int n) {
    List<Integer> list = new ArrayList<>();
    int k = 1;
    for (int i = 2; ; i++) {
      if (isPrime(i)) {
        list.add(k);
        k++;
      }
      if (k == n) {
        break;
      }
    }
    return list;
  }
  public abstract boolean isPrime(int num);
}

class MyPrimeGenerator extends PrimeGenerator {

  @Override
  public boolean isPrime(int num) {
    if (num < 2 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}

public class NumberManager {

  public static void main(String[] args) {
    PrimeGenerator obj = new MyPrimeGenerator();
    List<Integer> list = obj.generatePrime(10, 100);
    System.out.println(list);
  }
}
