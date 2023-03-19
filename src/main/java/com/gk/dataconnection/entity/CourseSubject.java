package com.gk.dataconnection.entity;

import jakarta.persistence.*;

@Entity
public class CourseSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int courseSubjectId;
    int courseId;
    int subjectId;

    public CourseSubject() {
    }

    public CourseSubject(int courseSubjectId, int courseId, int subjectId) {
        this.courseSubjectId = courseSubjectId;
        this.courseId = courseId;
        this.subjectId = subjectId;
    }

    public int getCourseSubjectId() {
        return courseSubjectId;
    }

    public void setCourseSubjectId(int courseSubjectId) {
        this.courseSubjectId = courseSubjectId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
}
