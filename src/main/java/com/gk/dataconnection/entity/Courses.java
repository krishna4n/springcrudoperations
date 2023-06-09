package com.gk.dataconnection.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

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
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    List<Subjects> subjects;

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }

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
