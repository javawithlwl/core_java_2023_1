package com.careerit.jfs.basics.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

  private List<Employee> employees;
  int count = 0;
  public EmployeeServiceImpl(){
        this.employees = new ArrayList<>();
  }

  @Override
  public void addEmployee(Employee employee) {
     employees.add(employee);
     System.out.println("Employee added");
  }

  @Override
  public List<Employee> getEmployees() {
      return employees;
  }

  @Override
  public boolean deleteEmployee(int empno) {
        int index = getIndex(empno);
        if(index !=-1){
            employees.remove(index);
            return true;
        }
        return false;
  }

  @Override
  public Employee getEmployee(int empno) {
    return null;
  }

  @Override
  public void updateEmployee(Employee employee) {

  }

  private int getIndex(int empno){
      for(int i=0;i<=count;i++){
          Employee emp = employees.get(i);
          if(emp.getEmpno() == empno){
            return i;
          }
      }
      return -1;
  }
}
