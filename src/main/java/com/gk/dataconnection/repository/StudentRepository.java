package com.gk.dataconnection.repository;

import com.gk.dataconnection.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
