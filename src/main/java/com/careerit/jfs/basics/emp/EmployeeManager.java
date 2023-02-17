package com.careerit.jfs.basics.emp;

import java.util.Arrays;

public class EmployeeManager {

  public static void main(String[] args) {

      EmployeeService empService = new EmployeeServiceImpl();
      Employee emp1 = new Employee(1001,"Krish",98000);
      Employee emp2 = new Employee(1002,"Sai",88000);
      Employee emp3 = new Employee(1003,"Dhatri",78000);
      Employee emp4 = new Employee(1004,"Tanvi",68000);
      Employee emp5 = new Employee(1005,"Manju",58000);

      empService.addEmployee(emp1);
      empService.addEmployee(emp2);
      empService.addEmployee(emp3);
      empService.addEmployee(emp4);
      empService.addEmployee(emp5);

  }
}
