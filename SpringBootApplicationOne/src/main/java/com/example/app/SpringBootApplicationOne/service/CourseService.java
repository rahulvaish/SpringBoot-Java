package com.example.app.SpringBootApplicationOne.service;

import com.example.app.SpringBootApplicationOne.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CourseService {

    public List<Course> getCourses(){
        return Stream.of(new Course("CT12", "Java", 5, 5000),
                        new Course("CT98", "Spring boot", 3, 8000),
                        new Course("CT53467", "AWS", 2, 10000))
                .collect(Collectors.toList());
    }

}
