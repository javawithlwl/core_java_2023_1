package com.careerit.jfs.basics.day9;

public class StringExample3 {

  public static void main(String[] args) {

    String data = "1001-Manoj-35,1002-Satya-38,1003-Charan-34,1004-Sachin-25";
    String[] empData = data.split(",");
    int sum = 0;
    for (String ele : empData) {
      String[] arr = ele.split("-");
      System.out.println(arr[1].toUpperCase());
      sum += Integer.parseInt(arr[2]);
    }
    System.out.println("The sum of age is "+sum);
  }
}
