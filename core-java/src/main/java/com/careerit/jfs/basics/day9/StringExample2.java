package com.careerit.jfs.basics.day9;

import java.util.Arrays;

public class StringExample2 {

  public static void main(String[] args) {

    String name = "LIRIL";
    for (int i = 0; i < name.length(); i++) {
      System.out.println(name.charAt(i));
    }
    System.out.println(isPalindrome(name));

    String data = "Krish,Mom,Dad,Liril,John,Spider,Batman,123A321,12333,12321";
    String[] words=data.split(",");
    for(String word:words){
        if(isPalindrome(word.toLowerCase())){
          System.out.println(word);
        }
    }
  }

  public static boolean isPalindrome(String data) {
    for (int i = 0, j = data.length() - 1; i <= j; i++, j--) {
      if (data.charAt(i) != data.charAt(j)) {
        return false;
      }
    }
    return true;
  }
}
