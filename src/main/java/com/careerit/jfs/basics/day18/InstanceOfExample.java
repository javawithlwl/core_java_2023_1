package com.careerit.jfs.basics.day18;

import java.util.concurrent.ThreadLocalRandom;

public class InstanceOfExample {

  public static void main(String[] args) {
    Object ele = getElement();
    if(ele instanceof String name){
      //String name = (String)ele;
      System.out.println(name.toUpperCase());
    }

  }


  public static Object getElement() {
    Object obj[] = new Object[]{"Rajesh", 35, true, 55.90, 39, 75, false, "Mahesh", "Charan"};
    return obj[ThreadLocalRandom.current().nextInt(0, obj.length)];
  }
}

