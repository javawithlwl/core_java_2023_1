package com.careerit.jfs.basics.ems;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

  private List<Employee> employees;
  private List<Currency> currencies;

  public EmployeeService() {
    employees = loadEmployees();
    currencies = loadCurrencies();
  }

  public List<EmployeeDTO> getEmployeeDetails() {
    List<EmployeeDTO> list = new ArrayList<>();
    for (Employee emp : employees) {
      Currency currency = getCurrency(emp.getCountryCode());
      String empno = emp.getEmpno();
      String name = emp.getEname();
      String countryName = currency.getCountry();
      double sal = emp.getSalary();
      if(emp.getCountryCode().equalsIgnoreCase("INR")){
          sal = sal * 80;
      }
      String salary = currency.getSymbol() + " " + sal;
      EmployeeDTO employeeDTO = new EmployeeDTO(empno, name, countryName, salary);
      list.add(employeeDTO);
    }
    return list;

  }

  private Currency getCurrency(String code) {
    // Iterate over the currency list and find details of given currency code
    for (Currency currency : currencies) {
      if (currency.getCode().equalsIgnoreCase(code)) {
        return currency;
      }
    }
    return null;
  }

  // Load data from emp.csv
  private List<Employee> loadEmployees() {
    List<Employee> list = new ArrayList<>();
    try {
      Path path = new File(EmployeeService.class.getResource("/emp.csv").toURI()).toPath();
      List<String> lines = Files.readAllLines(path);
      for (int i = 1; i < lines.size(); i++) {
        String[] empData = lines.get(i).split(",");
        String id = empData[0];
        String name = empData[1];
        double salary = Double.parseDouble(empData[2]);
        String code = empData[3];
        Employee emp = Employee.builder()
            .empno(id)
            .ename(name)
            .salary(salary)
            .countryCode(code)
            .build();
        list.add(emp);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    return list;
  }

  // Load data from currency.csv
  private List<Currency> loadCurrencies() {
    List<Currency> list = new ArrayList<>();
    try {
      Path path = new File(EmployeeService.class.getResource("/currency.csv").toURI()).toPath();
      List<String> lines = Files.readAllLines(path);
      for (int i = 1; i < lines.size(); i++) {
        String[] currencyData = lines.get(i).split(",");
        String country = currencyData[0];
        String code = currencyData[1];
        String symbol = currencyData[2];
        Currency currency = Currency.builder()
            .code(code)
            .country(country)
            .symbol(symbol)
            .build();
        list.add(currency);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    return list;
  }

}
