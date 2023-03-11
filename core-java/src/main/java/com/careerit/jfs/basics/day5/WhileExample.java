package com.careerit.jfs.basics.day5;

public class WhileExample {

  public static void main(String[] args) {
    int i = 1;
    int num = 19;
    while (i <= 10) {
      System.out.println(num + " * " + i + " = " + (num * i));
      i++;
    }
  }

  private static int sumOfDigitsUntilSumGetSingleDigit(int num){
        while(num > 9){
            num = num % 10 + num /10;
        }
        return num;
  }
  private static int reverse(int num){
        int rev = 0;
        while(num != 0){
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        return rev;
  }
  private static boolean isPalindrome(int num){
       return reverse(num) == num;
  }
  private static int gcd(int num1,int num2){

      if(num1 == num2){
        return num1;
      }
      if(isPrime(num1) || isPrime(num2)){
          return 1;
      }
      while(num1 != num2){
          if(num1 > num2){
              num1 = num1 - num2;
          }else{
              num2 = num2 - num1;
          }
      }
      return num1;

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

  private static int sumOfDigits(int num){
        int sum = 0;
        while(num!=0){
            int r = num % 10;
            sum += r;
            num /= 10;
        }
        return sum;
  }
  private static boolean armstrongNumber(int num){
    int sum = 0;
    int temp = num;
    while(temp!=0){
      int r = temp % 10;
      sum += (r * r * r);
      temp /= 10;
    }
    return num == sum;
  }
}
