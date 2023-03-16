package com.gk.dataconnection.controller;

import com.gk.dataconnection.entity.Student;
import com.gk.dataconnection.repositary.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentRepositary studentrepo;
    @PostMapping("/post/student")
    public ResponseEntity<Student> saveStudent(@RequestBody  Student student){
       return new ResponseEntity<>(studentrepo.save(student), HttpStatus.CREATED);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(studentrepo.findAll(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id){
        Optional<Student> student = studentrepo.findById(id);
        if(student.isPresent()){
            return new ResponseEntity<>(student.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
