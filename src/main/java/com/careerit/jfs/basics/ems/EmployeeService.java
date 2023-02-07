package com.careerit.jfs.basics.ems;
import java.util.List;

public class EmployeeService {

      private List<Employee> employees;
      private List<Currency> currencies;

      public EmployeeService(){
          employees = loadEmployees();
          currencies = loadCurrencies();
      }

      public List<EmployeeDTO> getEmployeeDetails(){
          return null;
      }

      private Currency getCurrency(String code){
        // Iterate over the currency list and find details of given currency code
        return null;
      }

      // Load data from emp.csv
      private List<Employee> loadEmployees(){
        return null;
      }
      // Load data from currency.csv
      private List<Currency> loadCurrencies(){
          return null;
      }

}
