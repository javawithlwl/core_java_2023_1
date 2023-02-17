package com.careerit.jfs.basics.collections;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

  public static void main(String[] args) {

    List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    List<Integer> list2 = new ArrayList<>(List.of(3, 6, 7, 8, 9));
    System.out.println(list1.size());
    System.out.println(list1.get(2));
    list1.remove(Integer.valueOf(3));
    System.out.println(list1);
    list1.addAll(list2);
    System.out.println(list1);
    System.out.println(list1.isEmpty());
    List<Integer> list=null;
    //Logic
    System.out.println(isEmpty(list));
    System.out.println(list1.containsAll(list2));
  }

  private static boolean isEmpty(List<Integer> list){
       return CollectionUtils.isEmpty(list);
  }
}
