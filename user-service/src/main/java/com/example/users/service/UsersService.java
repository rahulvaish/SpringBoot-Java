package com.example.users.service;

import com.example.users.entity.Users;
import com.example.users.repository.UsersRepository;
import com.example.users.valueObject.Department;
import com.example.users.valueObject.ResponseValueObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    RestTemplate rtemplate;




    public Users saveUser(Users users) {
        log.info("Inside saveUser - UserService");
        return usersRepository.save(users);

    }

    public Users getUserById(Long id) {
        log.info("Inside getUserById - UserService");
        return  usersRepository.findById(id).get();
    }

    public ResponseValueObject getUserWithDepartmentOnUserId(Long id) {
        //RestTemplate rt = new RestTemplate(); //(RestTemplate) applicationContext.getBean("rtemplate");

        log.info("Inside getUserWithDepartmentOnUserId - UserService");
        ResponseValueObject responseValueObject = new ResponseValueObject();
        //Department department = rtemplate.getForObject("http://localhost:8061/departments/"+id, Department.class);
        Department department = rtemplate.getForObject("http://department-service/departments/"+id, Department.class);
        responseValueObject.setDepartment(department);
        responseValueObject.setUsers(getUserById(id));
        return responseValueObject;
    }
}
