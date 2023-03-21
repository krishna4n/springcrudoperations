package com.gk.dataconnection.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
            @Column(name = "subject_id")
    int subjectId;
    String subjectName;

    @ManyToMany(mappedBy = "subjectsSet", fetch = FetchType.LAZY)
    Set<Courses> coursesSet;
    public Subjects(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public Subjects(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
