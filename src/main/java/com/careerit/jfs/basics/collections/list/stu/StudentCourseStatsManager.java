package com.careerit.jfs.basics.collections.list.stu;

import com.careerit.jfs.basics.collections.list.stu.dto.StudentDTO;
import com.careerit.jfs.basics.collections.list.stu.service.CourseStatsService;
import com.careerit.jfs.basics.collections.list.stu.service.CourseStatsServiceImpl;

import java.util.List;

public class StudentCourseStatsManager {

  public static void main(String[] args) {

    CourseStatsService service = new CourseStatsServiceImpl();
    List<StudentDTO> students = service.getStudentWithCourseNames();
    students.stream().forEach(ele->{
      System.out.println("Name    :"+ele.getName());
      System.out.println("Courses :"+ele.getCourses());
      System.out.println("-".repeat(50));
    });
  }
}
