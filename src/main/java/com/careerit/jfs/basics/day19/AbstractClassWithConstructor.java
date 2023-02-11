package com.careerit.jfs.basics.day19;

abstract class One {
  One() {
    System.out.println("One");
  }

  public abstract void m1();
}

abstract class Two extends One {
  Two() {
    System.out.println("Two");
  }
  @Override
  public void m1(){
    System.out.println("M1");
  }
  abstract void m2();

  abstract void m3();
}

class Three extends Two {
  Three() {
    System.out.println("Three");
  }

  @Override
  void m2() {

  }

  @Override
  void m3() {

  }
}

public class AbstractClassWithConstructor {

  public static void main(String[] args) {
    One obj = new Three();
  }
}
