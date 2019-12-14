package com.ravi.learnspringboot;

import com.ravi.learnspringboot.entity.Student;
import com.ravi.learnspringboot.service.StudentService;
import com.ravi.learnspringboot.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired private StudentService studentService;

    @GetMapping("")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("")
    public Student createOrUpdate(@RequestBody Student student){
        return studentService.createOrUpdate(student);
    }
}