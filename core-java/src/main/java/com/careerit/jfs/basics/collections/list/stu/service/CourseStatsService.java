package com.careerit.jfs.basics.collections.list.stu.service;
import com.careerit.jfs.basics.collections.list.stu.dto.CourseCountDto;
import com.careerit.jfs.basics.collections.list.stu.dto.StudentDTO;
import com.careerit.jfs.basics.collections.list.stu.dto.TrainerDTO;

import java.util.List;

public interface CourseStatsService {

          List<StudentDTO> getStudentWithCourseNames();
          List<CourseCountDto> getCountOfStudentOfEachBatch();
          List<TrainerDTO> getTrainers();
}
