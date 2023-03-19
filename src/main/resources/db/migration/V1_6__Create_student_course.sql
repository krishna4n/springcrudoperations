CREATE TABLE student_course (
    student_course_id int NOT NULL,
    course_id int NOT NULL,
    student_id int NOT NULL,
    PRIMARY KEY (student_course_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id),
    FOREIGN KEY (student_id) REFERENCES student(student_id)
);