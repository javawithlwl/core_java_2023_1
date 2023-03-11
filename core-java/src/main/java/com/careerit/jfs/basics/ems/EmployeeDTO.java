package com.careerit.jfs.basics.ems;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeDTO {

    private String empno;
    private String name;
    private String countryName;
    private String salary;

}
