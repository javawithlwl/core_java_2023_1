package com.careerit.jfs.basics.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListExample6 {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(1001);
    list.add(1002);
    list.add(1003);
    list.add(1009);
    list.add(1006);
    list.add(1007);
    list.add(1008);
    list.add(1005);
    list.add(1004);

    List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println(sortedList);
  }
}
