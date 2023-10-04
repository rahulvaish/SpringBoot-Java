package com.example.app.SpringBootApplicationTwo.service;

import com.example.app.SpringBootApplicationTwo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return Stream.of(new Student(101, "basant", "1", "B"),
                        new Student(102, "Santosh", "2", "B"),
                        new Student(103, "Ajay", "11", "C"))
                .collect(Collectors.toList());
    }
}
