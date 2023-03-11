package com.careerit.jfs.basics.day5;

public class NumberOperations {

  public static int[] generatePrimes(int n) {
    int[] arr = new int[n];
    int c = 0;
    for (int i = 2; ; i++) {
      if (isPrime(i)) {
        arr[c++] = i;
      }
      if (c == n) {
        break;
      }
    }
    return arr;
  }

  public static int[] primeInRange(int lb, int ub) {
    int count = countPrime(lb, ub);
    int[] arr = new int[count];
    int c = 0;
    for (int i = lb; i <= ub; i++) {
      if (isPrime(i)) {
        arr[c++] = i;
      }
    }
    return arr;
  }

  public static int countPrime(int lb, int ub) {
    // 1001 10000 => 2,3,5,7 => 4
    int count = 0;
    for (int i = lb; i <= ub; i++) {
      if (isPrime(i)) {
        count++;
      }
    }
    return count;
  }

  private static boolean isPrime(int num) {
    if (num < 0 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static int gcd(int num1, int num2) {
    if (num1 == num2) {
      return num1;
    }
    if (isPrime(num1) || isPrime(num2)) {
      return 1;
    }
    while (num1 != num2) {
      if (num1 > num2) {
        num1 = num1 - num2;
      } else {
        num2 = num2 - num1;
      }
    }
    return num1;
  }

  private static int gcd(int num1, int num2, int num3) {
    return gcd(gcd(num1, num2), num3);
  }

  private static int factorial(int num) {
    if (num == 0 || num == 1) {
      return 1;
    }
    int res = 1;
    for (int i = 2; i <= num; i++) {
      res *= i;
    }
    return res;
  }

  // n = 5 => 1 + 1/2! + 1/3! + .... + 1/n!
  private static float sum(int n) {
    if (n == 1) {
      return 1;
    }
    float sum = 1;
    for (int i = 2; i <= n; i++) {
      sum += 1 / (float) factorial(i);
    }
    return sum;
  }

}
