package com.careerit.jfs.basics.day10;

public class StringBuilderExample {
  private static StringBuilder sb;

  public static void main(String[] args) {

    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println(sb1 == sb2);
    System.out.println(sb1.equals(sb2));

    String str = "malayalam";

    StringBuilder sb = new StringBuilder(str);
    String rev = sb.reverse().toString();
    if(str.equals(rev)){
      System.out.println(str +" is palindrome");
    }




  }
  public static boolean isPalindrome(String str){
    return new StringBuilder(str).reverse().toString().equals(str);
  }
}
