package com.example.app.SpringBootApplicationTwo.controller;

import com.example.app.SpringBootApplicationTwo.model.Student;
import com.example.app.SpringBootApplicationTwo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

}
