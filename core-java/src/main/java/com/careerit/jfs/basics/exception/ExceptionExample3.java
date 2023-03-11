package com.careerit.jfs.basics.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample3 {

  public static void main(String[] args) {

      Throwable[] arr = new Throwable[]{
          new IOException(),new RuntimeException(),
          new NullPointerException(),new StringIndexOutOfBoundsException(),
          new ArrayIndexOutOfBoundsException(),new FileNotFoundException()
      };

      int cecount=0;
      int uecount = 0;
      for(Throwable t:arr){
          if(t instanceof RuntimeException){
              uecount++;
          }else if(t instanceof  Exception){
              cecount++;
          }
      }
    System.out.println(uecount);
    System.out.println(cecount);
  }
}
