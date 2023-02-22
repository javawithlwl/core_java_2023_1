package com.careerit.jfs.basics.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();
    set.add(1005);
    set.add(1001);
    set.add(1002);
    set.add(1001);
    set.add(null);
    set.add(null);
    set.add(1004);

    System.out.println(set);
    set.stream().forEach(System.out::println);
  }
}
