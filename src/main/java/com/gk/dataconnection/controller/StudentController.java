package com.gk.dataconnection.controller;

import com.gk.dataconnection.entity.Student;
import com.gk.dataconnection.repository.StudentRepository;
import com.gk.dataconnection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        ;
        return studentService.saveStudent(student);
    }
    @DeleteMapping("/students/{student_id}")
    public String deleteStudent(@PathVariable int student_id){

        return studentService.deleteStudent(student_id);
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }

    @PutMapping("/student/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }
}
