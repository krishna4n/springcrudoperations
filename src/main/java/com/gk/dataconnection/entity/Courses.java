package com.gk.dataconnection.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
            @Column(name = "course_id")
    int courseId;
    String courseName;

    @OneToMany(cascade = CascadeType.ALL)
            @JoinColumn(name="course_id", referencedColumnName = "course_id")
    List<Subjects> subjectsList ;


    public Courses(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public Courses() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
