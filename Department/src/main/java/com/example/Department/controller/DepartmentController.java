package com.example.Department.controller;

import com.example.Department.model.Dept;
import com.example.Department.model.ResponseValueObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.core.env.Environment;


@Controller
public class DepartmentController {

    @Autowired
    private Environment environment;

    @GetMapping("/getDepartmentFromUser")
    @ResponseBody
    public ResponseValueObject getDepartmentFromUser(){
        System.out.println("ENTER DEPARTMENT SERVICE"+ environment.getProperty("server.port"));
        ResponseValueObject responseValueObject = new ResponseValueObject();
        Dept department = new Dept();
        department.setDepartmentName("MY DEPARTMENT NAME");
        responseValueObject.setDepartment(department);
        responseValueObject.setMessage("SEND");
        System.out.println("EXIT DEPARTMENT SERVICE"+responseValueObject);
        return responseValueObject;
    }
}
