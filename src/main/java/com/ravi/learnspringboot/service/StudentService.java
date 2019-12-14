package com.ravi.learnspringboot.service;

import com.ravi.learnspringboot.entity.Student;

import java.util.List;

public interface StudentService {

    Student createOrUpdate(Student student);
    List<Student> getAllStudents();
}
