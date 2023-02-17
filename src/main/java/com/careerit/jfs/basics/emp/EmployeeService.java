package com.careerit.jfs.basics.emp;

import java.util.List;

public interface EmployeeService {

  void addEmployee(Employee employee);
  List<Employee> getEmployees();
  boolean deleteEmployee(int empno);
  Employee getEmployee(int empno);
  void updateEmployee(Employee employee);

}
