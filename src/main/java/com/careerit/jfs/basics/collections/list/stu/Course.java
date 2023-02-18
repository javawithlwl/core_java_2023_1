package com.careerit.jfs.basics.collections.list.stu;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Course {
  private int id;
  private String name;
  private int duration;
  private double fee;
}
