package com.careerit.jfs.basics.lambda;

import java.util.List;

interface I2 {
  int perform(int a, int b);
}

interface I1 {
  int reduce(List<Integer> list, I2 i2);
}

public class ReduceUsingLambda {
  public static int perform(List<Integer> list, I1 i1, I2 i2) {
    int res = i1.reduce(list, i2);
    return res;
  }

  public static void main(String[] args) {
    List<Integer> inputList = List.of(2, 3, 4, 5, 6, 7, 8, 9, 1, 10);
    I2 i2 = (a,b)-> a + b;
    I1 i1 = (list,ope)->{
          int s = 0;
          for(int i=0;i<list.size();i++){
              s = ope.perform(s,list.get(i));
          }
          return s;
    };
    int res = perform(inputList,i1,i2);
    System.out.println(res);
  }
}
