package com.careerit.jfs.basics.day17;

class One {
  int a = 10;
  public One() {
    super();
    System.out.println("One");
  }

  public void show() {
    System.out.println("Show of One");
  }
}

class Two extends One {
  int a = 100;

  public Two() {
    super();
    System.out.println("Two");
  }

  @Override
  public void show() {
    System.out.println("Show of Two");
  }

  public void show(String data) {
    System.out.println("Show of One " + data);
  }
}

public class OverrideExample {

  public static void main(String[] args) {

    One obj = new Two();
    obj.show();
    System.out.println(obj.a);
    //obj.show("Hello");

  }
}
