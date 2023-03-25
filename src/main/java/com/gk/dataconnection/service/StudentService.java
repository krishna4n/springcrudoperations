package com.gk.dataconnection.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gk.dataconnection.entity.Student;
import com.gk.dataconnection.repository.CoursesRespository;
import com.gk.dataconnection.repository.StudentRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CoursesRespository coursesRespository;

    @JsonIgnore
    public Student saveStudent(Student student) {
        System.out.println(student.getCourses());
        return studentRepository.save(student);

    }

    public String deleteStudent(int id){
        Optional<Student> stud =studentRepository.findById(id);
        if(stud.isPresent()){
            studentRepository.deleteById(id);
            return id+" student is deleted successfully";
        }
        else {
            return "No student available with this id"+id;
        }
    }

    public ResponseEntity<Student> getStudent(int id){
        Optional<Student> std = studentRepository.findById(id);
        if(std.isPresent()){
            return new ResponseEntity<>(std.get(), HttpStatus.OK) ;
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public String updateStudent(int id,Student student){
        Optional<Student> st = studentRepository.findById(id);
        if(st.isPresent()){
            st.get().setFatherName(student.getFatherName());
            st.get().setMotherName(student.getMotherName());
            st.get().setStudentName(student.getStudentName());
            st.get().setMobileNumber(student.getMobileNumber());
            studentRepository.save(st.get());
            return "updated student id "+id;
        }
        else{
            return "Not found id"+id;
        }
    }

    public List<Student> getStudents() {

        return studentRepository.findAll();
    }
}
