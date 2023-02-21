package com.careerit.jfs.basics.collections.list.stu.service;

import com.careerit.jfs.basics.collections.list.stu.*;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {
      @SneakyThrows
      public List<Student> loadFromCsvStudentInfo() {
        List<Student> students = new ArrayList<>();
        List<String> list = Files.readAllLines(Path.of(this.getClass().getResource("/data/student.csv").toURI()));
        for(int i=1;i<list.size();i++){
            String data = list.get(i);
            String[] arr = data.split(",");
            Student student = Student.builder()
                .id(Integer.parseInt(arr[0]))
                .name(arr[1])
                .qualification(arr[2])
                .build();
            students.add(student);
        }
        return students;
      }
  @SneakyThrows
  public List<Course> loadFromCsvCourseInfo() {
    List<Course> courses = new ArrayList<>();
    List<String> list = Files.readAllLines(Path.of(this.getClass().getResource("/data/course.csv").toURI()));
    for(int i=1;i<list.size();i++){
      String data = list.get(i);
      String[] arr = data.split(",");
      Course course = Course.builder()
          .id(Integer.parseInt(arr[0]))
          .name(arr[1])
          .duration(Integer.parseInt(arr[2]))
          .fee(Double.parseDouble(arr[3]))
          .build();
      courses.add(course);
    }
    return courses;
  }

  @SneakyThrows
  public List<Trainer> loadFromCsvTrainerInfo() {
    List<Trainer> trainers = new ArrayList<>();
    List<String> list = Files.readAllLines(Path.of(this.getClass().getResource("/data/trainer.csv").toURI()));
    for(int i=1;i<list.size();i++){
      String data = list.get(i);
      String[] arr = data.split(",");
      Trainer trainer = Trainer.builder()
          .id(Integer.parseInt(arr[0]))
          .name(arr[1])
          .qualification(arr[2])
          .build();
      trainers.add(trainer);
    }
    return trainers;
  }

  @SneakyThrows
  public List<CourseStudent> loadFromCsvCourseStudentInfo() {
    List<CourseStudent> courseStudents = new ArrayList<>();
    List<String> list = Files.readAllLines(Path.of(this.getClass().getResource("/data/course_student.csv").toURI()));
    for(int i=1;i<list.size();i++){
      String data = list.get(i);
      String[] arr = data.split(",");
      CourseStudent course = CourseStudent.builder()
          .studentId(Integer.parseInt(arr[0]))
          .courseId(Integer.parseInt(arr[1]))
          .build();
      courseStudents.add(course);
    }
    return courseStudents;
  }
  @SneakyThrows
  public List<CourseTrainer> loadFromCsvCourseTrainerInfo() {
    List<CourseTrainer> courseTrainers = new ArrayList<>();
    List<String> list = Files.readAllLines(Path.of(this.getClass().getResource("/data/course_trainer.csv").toURI()));
    for(int i=1;i<list.size();i++){
      String data = list.get(i);
      String[] arr = data.split(",");
      CourseTrainer course = CourseTrainer.builder()
          .trainerId(Integer.parseInt(arr[0]))
          .courseId(Integer.parseInt(arr[1]))
          .build();
      courseTrainers.add(course);
    }
    return courseTrainers;
  }

}
