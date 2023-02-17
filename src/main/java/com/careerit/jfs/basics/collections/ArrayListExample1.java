package com.careerit.jfs.basics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample1 {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(1001);
    list.add(1002);
    list.add(1005);
    list.add(1004);
    list.add(1003);

    // for loop
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i)+" ");
    }
    // for each
    System.out.println("\n"+"-".repeat(30));
    for(Integer ele:list){
      System.out.print(ele+" ");
    }
    // Iterator or ListIterator
    System.out.println("\n"+"-".repeat(30));
    Iterator<Integer> iterator = list.iterator();
    while(iterator.hasNext()){
        Integer ele = iterator.next();
        System.out.print(ele+" ");
    }
    System.out.println("\n"+"-".repeat(30));
    ListIterator<Integer> listItr = list.listIterator();
    while(listItr.hasNext()){
      Integer ele = listItr.next();
      if(ele==1005){
          listItr.set(1010);
      }
      System.out.print(ele+" ");
    }

    System.out.println("\n"+"-".repeat(30));
    while(listItr.hasPrevious()){
      Integer ele = listItr.previous();
      System.out.print(ele+" ");
    }

    System.out.println("\n"+"-".repeat(30));
    list.stream().forEach(ele-> System.out.print(ele+" "));
  }
}
