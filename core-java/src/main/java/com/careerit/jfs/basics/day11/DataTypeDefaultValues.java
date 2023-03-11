package com.careerit.jfs.basics.day11;

class JavaDataTypes{
    byte b;
    short s;
    char c;
    float f;
    double d;
    long l;
    boolean bo;
    int i;
    String name;
    public void showDefaultValues(){
      System.out.println("Byte default value :"+b+" min "+Byte.MIN_VALUE+" max "+Byte.MAX_VALUE);
      System.out.println("Short default value :"+b+" min "+Short.MIN_VALUE+" max "+Short.MAX_VALUE);
      System.out.println("Char default value :"+c+" min "+Character.MIN_VALUE+" max "+Character.MAX_VALUE);
      System.out.println("Int default value :"+i+" min "+Integer.MIN_VALUE+" max "+Integer.MAX_VALUE);
      System.out.println("Double default value :"+d+" min "+Double.MIN_VALUE+" max "+Double.MAX_VALUE);
      System.out.println("Long default value :"+l+" min "+Long.MIN_VALUE+" max "+Long.MAX_VALUE);
      System.out.println("Float default value :"+f+" min "+Float.MIN_VALUE+" max "+Float.MAX_VALUE);
      System.out.println("Boolean default value :"+bo);
      System.out.println("String name :"+name);
    }
}
public class DataTypeDefaultValues {

  public static void main(String[] args) {
    JavaDataTypes obj = new JavaDataTypes();
    obj.showDefaultValues();
  }
}
