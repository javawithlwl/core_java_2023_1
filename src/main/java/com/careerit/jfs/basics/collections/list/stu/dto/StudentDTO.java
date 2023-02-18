package com.careerit.jfs.basics.collections.list.stu.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentDTO {

      private String name;
      private List<String> courses;
}
