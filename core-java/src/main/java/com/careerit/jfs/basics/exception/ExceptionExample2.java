package com.careerit.jfs.basics.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExceptionExample2 {

  public static void main(String[] args) {

    System.out.println("Start of the main method");


    String line = null;
    try (InputStream inputstream = ExceptionExample2.class.getResourceAsStream("/sample.txt");
         BufferedReader br = new BufferedReader(new InputStreamReader(inputstream));) {
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("End of the main method");
  }
}
