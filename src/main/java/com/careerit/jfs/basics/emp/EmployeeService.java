package com.careerit.jfs.basics.emp;

public interface EmployeeService {

  void addEmployee(Employee employee);
  Employee[] getEmployees();
  boolean deleteEmployee(int empno);
  Employee getEmployee(int empno);
  void updateEmployee(Employee employee);

}
