package com.springboot.mongo.springbootmongo.controller;

import com.springboot.mongo.springbootmongo.entity.Student;
import com.springboot.mongo.springbootmongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public void deleteStudentById(@PathVariable String id){
         studentService.deleteStudentById(id);
    }

    @GetMapping("/getStudentNameAndEmail/{name}/{email}")
    public List<Student> getStudentNameAndEmail(@PathVariable String name, @PathVariable String email){
        //return studentService.getStudentNameAndEmail(name, email);
        return studentService.getStudentNameAndEmailNativeQ(name, email);
    }

    @GetMapping("/getStudentNameOrEmail/{name}/{email}")
    public List<Student> getStudentNameOrEmail(@PathVariable String name, @PathVariable String email){
        return studentService.getStudentNameOrEmail(name, email);
    }
}
