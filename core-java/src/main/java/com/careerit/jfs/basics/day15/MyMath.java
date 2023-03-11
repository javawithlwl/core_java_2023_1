package com.careerit.jfs.basics.day15;

public class MyMath extends  Object{
  public int add(int a, int b) {
    return a + b;
  }

  public float add(float a, float b) {
    return a + b;
  }

  public String add(String a, String b) {
    return a + b;
  }

  public static void main(String[] args) {

    MyMath obj = new MyMath();
    System.out.println(obj.toString());
  }
}
