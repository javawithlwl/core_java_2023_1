package com.careerit.jfs.basics.day3;

import java.util.Scanner;

/*
Write a program to accept the following details of an employee:
empno, name and monthly salary; calculate the yearly salary and display the result.
 */
public class EmployeeDetails {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the empno:");
    int empno = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the name:");
    String name = sc.nextLine();
    System.out.println("Enter the salary(monthly):");
    double salary = sc.nextDouble();
    double yearlySalary = salary * 12;
    System.out.println(empno+"-"+name+"-"+salary+"-"+yearlySalary);
  }

}
