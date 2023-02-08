package com.careerit.jfs.basics.ems;

import java.util.List;

public class EmployeeManager {

  public static void main(String[] args) {

    EmployeeService employeeService = new EmployeeService();
    List<EmployeeDTO> list = employeeService.getEmployeeDetails();
    for (EmployeeDTO emp : list) {
      System.out.println(String.format("%s,%s,%s,%s", emp.getEmpno(), emp.getName(), emp.getCountryName(), emp.getSalary()));
    }
  }
}
