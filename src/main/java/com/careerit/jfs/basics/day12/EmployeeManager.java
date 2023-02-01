package com.careerit.jfs.basics.day12;

public class EmployeeManager {

  public static void main(String[] args) {

    String data = "1001-Rajesh-97000-DEV,1002-Manoj-87000-DEV,2001-Mastan-57000-QA,3001-Ramu-57000-HR,3001-John-97000-QA";

    Employee[] arr = getEmployee(data);

    // Get max paid employee
    // Get max paid employee of given department
    // Get total salary of all employees


  }

  private static double totalSalary(Employee[] arr){

    return 0;
  }
  private static Employee getMaxPaidEmployee(String dept){
      return null;
  }
  private static Employee getMaxPaidEmployee(Employee[] arr){
      return null;
  }


  private static Employee[] getEmployee(String data){
      String[] arr = data.split(",");
      Employee[] empArr = new Employee[arr.length];
      int i=0;
      for(String empData:arr){
          String[] earr = empData.split("-");
          Long empno = Long.parseLong(earr[0]);
          String name = earr[1];
          double salary = Double.parseDouble(earr[2]);
          String dept = earr[3];
          Employee emp = new Employee(empno,name,salary,dept);
          empArr[i++] = emp;
      }
      return empArr;
  }
}
