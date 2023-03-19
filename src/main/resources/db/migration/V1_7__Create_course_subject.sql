CREATE TABLE course_subject (
    course_subject_id int NOT NULL,
    course_id int NOT NULL,
    subject_id int NOT NULL,
    PRIMARY KEY (course_subject_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id),
    FOREIGN KEY (subject_id) REFERENCES subjects(subject_id)
);