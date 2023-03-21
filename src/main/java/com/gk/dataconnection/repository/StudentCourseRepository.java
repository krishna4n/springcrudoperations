package com.gk.dataconnection.repository;

import com.gk.dataconnection.entity.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourse,Integer> {
}
