package com.springboot.mongo.springbootmongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document (collection = "student")
public class Student {

    @Id
    private String id;

    //@Field(name = "name")
    private String studentName;

    private String email;

    private Dep department;

    private List<Subject> subjects;

//    public Student(String email) {
//        this.email = email;
//    }
//
//    @PersistenceCreator // Use this when u have multiple constructors
    //THIS CONSTUCTOR IS IMPORTANT
    public Student(String id, String studentName, String email, Dep department, List<Subject> subjects) {
        this.id = id;
        this.studentName = studentName;
        this.email = email;
        this.department = department;
        this.subjects = subjects;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dep getDept() {
        return department;
    }

    public void setDept(Dep dept) {
        this.department = dept;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
