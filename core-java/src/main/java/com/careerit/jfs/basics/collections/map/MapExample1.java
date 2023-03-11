package com.careerit.jfs.basics.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

  public static void main(String[] args) {

    Map<Integer,String> map = new HashMap<>();
    map.put(1001,"Sachin");
    map.put(1002,"Dhoni");
    map.put(1003,"Rohit");
    map.put(1001,"KL Rahul");

    Set<Integer> keys = map.keySet();
    for(Integer key:keys){
      System.out.println(key+" "+map.get(key));
    }

    Collection<String> values = map.values();
    for(String value:values){
      System.out.println(value);
    }

    Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
    for(Map.Entry<Integer,String> entry:entrySet){
      System.out.println(entry.getKey()+" "+entry.getValue());
    }
    map.entrySet().stream().forEach((entry)->
        System.out.println(entry.getKey()+" "+entry.getValue()));
  }
}
