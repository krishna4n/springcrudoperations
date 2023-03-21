package com.gk.dataconnection.repository;

import com.gk.dataconnection.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRespository extends JpaRepository<Courses, Integer> {
}
