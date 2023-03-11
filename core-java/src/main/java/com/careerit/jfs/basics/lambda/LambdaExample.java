package com.careerit.jfs.basics.lambda;


import com.careerit.jfs.basics.day17.two.E;

import java.util.ArrayList;
import java.util.List;

interface AbstractMathOperations {

  boolean isEven(int num);

}

interface MathOperation {
  int perform(int num1, int num2);
}

interface MyPredicate {
  boolean test(int num);
}


public class LambdaExample {

  public static List<Integer> filterData(List<Integer> list, MyPredicate myPredicate) {
    List<Integer> filteredList = new ArrayList<>();
    for (Integer ele : list) {
      if (myPredicate.test(ele)) {
        filteredList.add(ele);
      }
    }
    return filteredList;
  }

  public static void main(String[] args) {
    List<Integer> inputList = List.of(2, 3, 4, 5, 6, 8, 9, 1, 10);
    List<Integer> evenList = filterData(inputList, (num)->num % 2 == 0);
    System.out.println(evenList);

    List<Integer> gt5List = filterData(inputList, (num)-> num > 5);
    System.out.println(gt5List);

    //

  }
}
