package com.careerit.jfs.basics.generics;

import lombok.extern.java.Log;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class EmployeeService {
  @LogInfo(name = "System",action = "READ")
  public Employee readEmployee(int empno){
      return null;
  }
  @LogInfo(name = "API",action = "WRITE")
  public Employee createEmployee(Employee employee){
    return employee;
  }
  public static void main(String[] args) {

    Method[] methods = EmployeeService.class.getDeclaredMethods();
    for(Method m:methods){
      Annotation[] annotations = m.getDeclaredAnnotations();
      System.out.println(m.getName());
      for(Annotation annotation:annotations){
          if(annotation instanceof LogInfo logInfo){
            System.out.println(logInfo.name());
            System.out.println(logInfo.action());
          }
      }
    }

  }
}
