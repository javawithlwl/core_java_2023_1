package com.careerit.jfs.basics.ems;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

  private String empno;
  private String ename;
  private String countryCode;
  private double salary;
}
