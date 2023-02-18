package com.careerit.jfs.basics.collections.list.stu.service;

import com.careerit.jfs.basics.collections.list.stu.Trainer;
import com.careerit.jfs.basics.collections.list.stu.dto.CourseCountDto;
import com.careerit.jfs.basics.collections.list.stu.dto.StudentDTO;

import java.util.List;

public interface CourseStatsService {

          List<StudentDTO> getStudentWithCourseNames();
          List<CourseCountDto> getCountOfStudentOfEachBatch();
          List<Trainer> getTrainers();
}
