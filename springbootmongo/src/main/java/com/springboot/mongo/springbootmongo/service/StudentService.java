package com.springboot.mongo.springbootmongo.service;

import com.springboot.mongo.springbootmongo.entity.Student;
import com.springboot.mongo.springbootmongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student createStudent( Student student){
        return studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(String id) {
         studentRepository.deleteById(id);
    }


    public List<Student> getStudentNameAndEmail(String name, String email) {
        return studentRepository.findByStudentNameAndEmail(name, email);
    }

    public List<Student> getStudentNameOrEmail(String name, String email) {
        return studentRepository.findByStudentNameOrEmail(name, email);
    }

    public List<Student> getStudentNameAndEmailNativeQ(String name, String email) {
        return studentRepository.getStudentNameAndEmailNativeQ(name, email);
    }
}
