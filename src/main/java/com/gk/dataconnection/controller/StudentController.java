package com.gk.dataconnection.controller;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.gk.dataconnection.entity.Courses;
import com.gk.dataconnection.entity.Student;
import com.gk.dataconnection.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CoursesRespository coursesRespository;
    @Autowired
    SubjectsRepository subjectsRepository;

    @PostMapping("/save/student")
    public ResponseEntity<String> saveStudent(@RequestBody  Student student){

        studentRepository.save(student);
       return ResponseEntity.ok("Saved");
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id){
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            return new ResponseEntity<>(student.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student stud){
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            student.get().setStudentName(stud.getStudentName());
            return new ResponseEntity<>(studentRepository.save(student.get()),HttpStatus.OK);
        }
        else{
                return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/student/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id){
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            studentRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
