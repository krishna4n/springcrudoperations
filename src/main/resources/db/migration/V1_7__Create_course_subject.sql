alter TABLE subjects add(course_id int, FOREIGN KEY (course_id) REFERENCES courses(course_id));
