package com.ravi.learnspringboot.service.impl;

import com.ravi.learnspringboot.entity.Student;
import com.ravi.learnspringboot.repository.StudentRepo;
import com.ravi.learnspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student createOrUpdate(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }


}
