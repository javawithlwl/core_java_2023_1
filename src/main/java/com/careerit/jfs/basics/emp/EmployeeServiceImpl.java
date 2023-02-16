package com.careerit.jfs.basics.emp;

public class EmployeeServiceImpl implements EmployeeService {

  private Employee[] employees;

  public EmployeeServiceImpl(){
        this.employees = new Employee[3];
  }

  @Override
  public void addEmployee(Employee employee) {

  }

  @Override
  public Employee[] getEmployees() {
    return null;
  }

  @Override
  public boolean deleteEmployee(int empno) {
    return false;
  }

  @Override
  public Employee getEmployee(int empno) {
    return null;
  }

  @Override
  public void updateEmployee(Employee employee) {

  }
}
