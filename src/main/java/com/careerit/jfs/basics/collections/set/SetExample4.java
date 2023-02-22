package com.careerit.jfs.basics.collections.set;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SetExample4 {

  public static void main(String[] args) {

    List<Integer> list = IntStream.rangeClosed(1,200).boxed().collect(Collectors.toList());
    Set<Integer> set = new HashSet<>();
    while(set.size()!=50){
        int rnum = ThreadLocalRandom.current().nextInt(1,201);
        set.add(list.get(rnum));
    }
    System.out.println(set.size());
  }
}
