package com.course.cruddemo.dao;

import com.course.cruddemo.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student finById(Integer id);
}
