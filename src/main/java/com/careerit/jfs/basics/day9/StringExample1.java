package com.careerit.jfs.basics.day9;

public class StringExample1 {

  public static void main(String[] args) {

    String name1 = "Core";
    String name2 = "Core";
    String name3 = new String("Core");
    String name4 = new String("Core");
    System.out.println(name1 == name2);
    System.out.println(name3 == name4);

    System.out.println(name1.equals(name3));
    System.out.println(name2.equals(name4));

    String[] names = new String[]{"Krish", "Manoj", "Krishna", "John", "Don", "Dummy"};
    // Search given name = ?
    String name = new String("Krish");
    System.out.println(isFound(names, name));


  }

  public static boolean isFound(String[] names, String name) {
   for (String ele : names) {
      if (ele.equals(name)) {
        return true;
      }
    }
    return false;
  }

}
