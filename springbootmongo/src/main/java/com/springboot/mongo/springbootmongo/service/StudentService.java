package com.springboot.mongo.springbootmongo.service;

import com.springboot.mongo.springbootmongo.entity.Student;
import com.springboot.mongo.springbootmongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.bson.Document;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    private MongoTemplate mongoTemplate;


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

    public String getEmailFromStudentName(String name) {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("studentName").is(name)),
                Aggregation.project("email"));
        List<Document> results = mongoTemplate.aggregate(aggregation, "student", Document.class).getMappedResults();
        if (!results.isEmpty()) {
            Document studentDocument = results.get(0);
            return studentDocument.getString("email");
        }
        return null;
    }
}
