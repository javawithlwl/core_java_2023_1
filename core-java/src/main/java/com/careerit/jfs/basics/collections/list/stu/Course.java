package com.careerit.jfs.basics.collections.list.stu;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
  private int id;
  private String name;
  private int duration;
  private double fee;
}