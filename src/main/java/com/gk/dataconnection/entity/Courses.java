package com.gk.dataconnection.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
            @Column(name = "course_id")
    int courseId;
    String courseName;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "course_subject" ,
    joinColumns = {
            @JoinColumn(name="course_id", referencedColumnName = "course_id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "subject_id", referencedColumnName = "subject_id")

    })
    Set<Subjects> subjectsSet;

    @ManyToMany(mappedBy = "coursesSet", cascade = CascadeType.ALL)
    Set<Student> studentSet;

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
