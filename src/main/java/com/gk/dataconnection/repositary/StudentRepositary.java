package com.gk.dataconnection.repositary;

import com.gk.dataconnection.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositary extends JpaRepository<Student,Integer> {
}
