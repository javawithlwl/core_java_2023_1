package com.careerit.jfs.basics.day17;

class C1 {
  int a = 10;

  C1() {
    System.out.println("C1");
  }

  public void show() {
    System.out.println(a);
  }
}

class C2 extends C1 {
  int a = 100;
  C2() {
    System.out.println("C2");
  }

  public void show() {
    System.out.println(a);
  }
}

class C3 extends C2 {
  int a = 1000;

  C3() {
    System.out.println("C3");
  }

  public void show() {
    System.out.println(a+" "+super.a);
  }
}


public class OverrideExample2 {

  public static void main(String[] args) {
    C1 obj = new C3();
    obj.show();
  }
}
