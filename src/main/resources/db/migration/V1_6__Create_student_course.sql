alter TABLE courses add(student_id int, FOREIGN KEY (student_id) REFERENCES student(student_id));
