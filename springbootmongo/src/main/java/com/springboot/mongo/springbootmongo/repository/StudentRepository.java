package com.springboot.mongo.springbootmongo.repository;

import com.springboot.mongo.springbootmongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByStudentNameAndEmail(String name, String email);

    List<Student> findByStudentNameOrEmail(String name, String email);

    @Query("{\"studentName\" : \"?0\" , \"email\" : \"?1\"}")
    List<Student> getStudentNameAndEmailNativeQ(String name, String email);
}
