package com.gk.dataconnection.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
            @Column(name = "student_id")
    int studentId;
    @Column(name = "student_name")
    String studentName;
    String fatherName;
    String motherName;
    int mobileNumber;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="student_id", referencedColumnName = "student_id")
    List<Courses> courses ;

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public Student() {
    }

    public Student(int studentId, String studentName, String fatherName, String motherName, int mobileNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.mobileNumber = mobileNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
