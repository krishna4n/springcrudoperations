package com.gk.dataconnection.repository;

import com.gk.dataconnection.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRespository extends JpaRepository<Courses, Integer> {
}
