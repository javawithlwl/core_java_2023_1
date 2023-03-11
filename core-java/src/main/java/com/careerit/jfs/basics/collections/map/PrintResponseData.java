package com.careerit.jfs.basics.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintResponseData {

  public static void main(String[] args) {

    String[] headers = "name,age".split(",");

    List<Map<String, String>> data = new ArrayList<>();
    Map<String, String> row1 = new HashMap<>();
    row1.put("name", "Krish");
    row1.put("age", "35");
    Map<String, String> row2 = new HashMap<>();
    row2.put("name", "Mastan K");
    row2.put("age", "30");
    Map<String, String> row3 = new HashMap<>();
    row3.put("name", "Satya");
    row3.put("age", "37");
    List<Map<String, String>> list = List.of(row1, row2, row3);
    for (String heading : headers) {
      System.out.print(heading + "\t");
    }
    System.out.println();
    for (Map<String, String> map : list) {
      System.out.print(map.get("name") + "\t");
      System.out.println(map.get("age"));
    }

  }
}
