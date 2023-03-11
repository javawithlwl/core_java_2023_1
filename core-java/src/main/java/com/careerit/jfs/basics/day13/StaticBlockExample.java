package com.careerit.jfs.basics.day13;

class StaticBlock {
  static {
    System.out.println("Static Block");
  }
  public StaticBlock(){
    System.out.println("Constructor");
  }
  static {
    System.out.println("Static Block-2");
  }
}

public class StaticBlockExample {
  public static void main(String[] args) {
    StaticBlock obj1 = new StaticBlock();
    StaticBlock obj2 = new StaticBlock();
    StaticBlock obj3 = new StaticBlock();
  }
}
