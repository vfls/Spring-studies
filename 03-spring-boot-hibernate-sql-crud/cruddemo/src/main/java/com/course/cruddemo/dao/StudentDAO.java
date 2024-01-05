package com.course.cruddemo.dao;

import com.course.cruddemo.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student finById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);
}
