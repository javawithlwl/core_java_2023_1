package com.careerit.jfs.basics.interfaceex;

interface One{
    void m1();
}
interface Two{
    void m2();
    void m1();
}
abstract  class C1 implements  One,Two{

  @Override
  public void m2() {

  }

}
class C2 extends  C1{
  @Override
  public void m1() {

  }
}
public class InterfaceeExample {
}
