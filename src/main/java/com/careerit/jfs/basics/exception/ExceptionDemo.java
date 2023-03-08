package com.careerit.jfs.basics.exception;

import java.util.List;

public class ExceptionDemo {

  public static void main(String[] args) {

    List<String> list = List.of("Krish", "Manoj", "CV", "Rajesh", "Suresh");
    for (String name : list) {
      try {
        System.out.println(name.substring(0, 3).toUpperCase());
        //Logic

      } catch (StringIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
      } catch (ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();

      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    }
  }
