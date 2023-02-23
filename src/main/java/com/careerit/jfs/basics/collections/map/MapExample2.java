package com.careerit.jfs.basics.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();
    String[] names = new String[]{"Sri", "Lakshman", "Satya", "Manoj", "Naresh", "Lakshman", "Satya", "Sri", "Lakshman", "Satya", "Lakshman", "Satya"};

    Arrays.stream(names).forEach(name -> {
        int value = map.getOrDefault(name,0);
        map.put(name,value+1);
    });
    System.out.println(map);
  }
}
