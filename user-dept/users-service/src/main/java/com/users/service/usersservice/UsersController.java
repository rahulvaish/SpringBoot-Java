package com.users.service.usersservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller

public class UsersController {

    @Autowired
    RestTemplate rtemplate;



    @ResponseBody
    @RequestMapping(value = "/users/usersWithDept/{id}", produces = "application/json", consumes = "application/json", method = RequestMethod.GET)
    public ResponseValueObject getUserWithDepartmentOnUserId(@PathVariable("id") Long id){
        ResponseValueObject responseValueObject = new ResponseValueObject();
        //Department department = rtemplate.getForObject("http://localhost:8061/departments/"+id, Department.class);
        Department department = rtemplate.getForObject("http://department-service/departments/"+id, Department.class);
        responseValueObject.setDepartment(department);
        Users users = Users.builder().userId(id).build();
        responseValueObject.setUsers(users);
        return responseValueObject;


    }




}
