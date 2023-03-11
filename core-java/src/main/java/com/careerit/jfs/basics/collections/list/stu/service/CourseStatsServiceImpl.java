package com.careerit.jfs.basics.collections.list.stu.service;

import com.careerit.jfs.basics.collections.list.stu.*;
import com.careerit.jfs.basics.collections.list.stu.dto.CourseCountDto;
import com.careerit.jfs.basics.collections.list.stu.dto.StudentDTO;
import com.careerit.jfs.basics.collections.list.stu.dto.TrainerDTO;

import java.util.ArrayList;
import java.util.List;

public class CourseStatsServiceImpl implements CourseStatsService {
  private FileReaderUtil fileReaderUtil;
  private List<Student> students;
  private List<Trainer> trainers;
  private List<Course> courses;
  private List<CourseStudent> courseStudents;
  private List<CourseTrainer> courseTrainers;

  public CourseStatsServiceImpl() {
    fileReaderUtil = new FileReaderUtil();
    students = fileReaderUtil.loadFromCsvStudentInfo();
    trainers = fileReaderUtil.loadFromCsvTrainerInfo();
    courseStudents = fileReaderUtil.loadFromCsvCourseStudentInfo();
    courseTrainers = fileReaderUtil.loadFromCsvCourseTrainerInfo();
    courses = fileReaderUtil.loadFromCsvCourseInfo();
  }

  @Override
  public List<StudentDTO> getStudentWithCourseNames() {
    List<StudentDTO> list = new ArrayList<>();
    for (Student student : students) {
      String name = student.getName();
      List<String> courses = getStudentCourseNames(student.getId());
      StudentDTO studentDTO = StudentDTO.builder()
          .name(name).courses(courses).
          build();
      list.add(studentDTO);
    }
    return list;
  }

  @Override
  public List<CourseCountDto> getCountOfStudentOfEachBatch() {
    return null;
  }

  @Override
  public List<TrainerDTO> getTrainers() {
    return null;
  }

  private List<String> getStudentCourseNames(int studentId) {
    List<String> courseNames = new ArrayList<>();
    for (CourseStudent obj : courseStudents) {
      if (obj.getStudentId() == studentId) {
        String courseName = getCourseName(obj.getCourseId());
        courseNames.add(courseName);
      }
    }
    return courseNames;
  }

  private String getCourseName(int courseId) {
    for (Course course : courses) {
      if (course.getId() == courseId) {
        return course.getName();
      }
    }
    return null;
  }
}
