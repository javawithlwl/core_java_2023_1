package com.careerit.jfs.basics.day9;

public class StringExample5 {

  private static String name;

  public static void main(String[] args) {

    String email = "satya@gmail.com,manoj@,suresh@gmail.com,rajesh@gmail,kiran@gmail.com";
    String[] arr = email.split(",");
    for (String e : arr) {
      if (isValidEmail(e)) {
        String name = e.substring(0, e.indexOf("@"));
        name = (name.charAt(0)+"").toUpperCase() + name.substring(1);
        System.out.println(name);
      }
    }
  }

  public static boolean isValidEmail(String email) {
    return email.indexOf("@") != -1 && email.indexOf(".") != -1;
  }
}
