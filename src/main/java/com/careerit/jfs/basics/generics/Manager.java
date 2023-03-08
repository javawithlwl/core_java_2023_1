package com.careerit.jfs.basics.generics;

import lombok.SneakyThrows;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("Hi");

    for (String obj : list) {
      System.out.println(obj.toUpperCase());
    }
    Employee emp = readFromCsv("empno:1001,ename:Krish,salary:45000", Employee.class);
    Product product = readFromCsv("name:Mac AirPro,price:78000", Product.class);
    System.out.println(emp);
    System.out.println(product);
    List<Integer> list1 = List.of(1,2,3);
    addNumbers(List.of(new Object(),new Object()));

  }
  @SneakyThrows
  public static <T> T readFromCsv(String str, Class<T> cls) {
    String[] data = str.split(",");
    Map<String, Object> map = new HashMap<>();
    for (String d : data) {
      String[] dd = d.split(":");
      map.put(dd[0], dd[1]);
    }
    Constructor constructor = cls.getConstructor();
    T obj = (T) constructor.newInstance();
    for (Map.Entry<String, Object> entry : map.entrySet()) {
      Field field = FieldUtils.getDeclaredField(cls, entry.getKey(), true);
      field.set(obj, entry.getValue());
    }
    return obj;
  }
  public static Double addValues(List<? extends  Number> list){

    return null;
  }

  public static Double addValue(List<?> list){

    return null;
  }
  public static void addNumbers(List<? super Integer> list) {
    for (int i = 1; i <= 10; i++) {
      list.add(i);
    }
  }


}
