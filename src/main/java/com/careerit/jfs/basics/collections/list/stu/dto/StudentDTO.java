package com.careerit.jfs.basics.collections.list.stu.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {

      private String name;
      private List<String> courses;
}
