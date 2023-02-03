package com.careerit.jfs.basics.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayListExample2 {

  public static void main(String[] args) {
    ArrayListExample2 obj = new ArrayListExample2();
    int n = 100;
    List<Integer> list = obj.generateRandomNumbers(n);
    System.out.println(list);

  }

  // Get n random numbers
  public List<Integer> generateRandomNumbers(int n) {
    List<Integer> randomList = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      int num = ThreadLocalRandom.current().nextInt(1000, 10000);
      randomList.add(num);
    }
    return randomList;
  }
  // Get only even number
  public List<Integer> getEvenNumberList(List<Integer> list){
      List<Integer> evenList = new ArrayList<>();
      for(Integer ele:list){
          if(ele % 2==0){
              evenList.add(ele);
          }
      }
      return evenList;
  }
  // Search element and return index; if element not present return -1
  public int getIndex(List<Integer> list,int ele){

      for(int i=0;i<list.size();i++){
          if(list.get(i)==ele){
            return i;
          }
      }
      return -1;
  }
}
