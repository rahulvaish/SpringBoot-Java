package com.example.app.SpringBootApplicationOne.controller;

import com.example.app.SpringBootApplicationOne.model.Course;
import com.example.app.SpringBootApplicationOne.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/getCourses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }
}
