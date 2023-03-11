package com.careerit.jfs.basics.day9;

public class StringExample4 {
  public static void main(String[] args) {
      String data = "Rajesh,Manoj,Charan , Kiran U , Jayesh, Ramu";
      for(String name:data.split(",")){
        System.out.println(name.trim().substring(1,3).toUpperCase());
      }
    System.out.println(data.substring(data.length()-5).trim().length());
  }
}
