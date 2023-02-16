package com.careerit.jfs.basics.interfaceex;

@FunctionalInterface
interface II1{
    void m1();
    default void m2(){

    }
    private void m3(){

    }
    static void m4(){

    }

}

@FunctionalInterface
interface MathOperation{

    int perform(int a,int b);
}
class AddOperation implements  MathOperation{

  @Override
  public int perform(int a, int b) {
    return a + b;
  }
}
class MultiplyOperation implements  MathOperation{

  @Override
  public int perform(int a, int b) {
    return a * b;
  }
}
class SubtractOperation implements  MathOperation{

  @Override
  public int perform(int a, int b) {
    return a > b ? a - b : b - a;
  }
}


public class FunctionalInterfaceExample {

  public static int calculate(int num1, int num2, MathOperation operation){
      return operation.perform(num1,num2);
  }
  public static void main(String[] args) {
    int mul = calculate(10, 5, (a,b)-> a * b);
    int sum = calculate(10, 5, (a,b)-> a + b);
  }
}
