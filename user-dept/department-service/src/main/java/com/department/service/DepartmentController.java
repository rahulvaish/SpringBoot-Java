package com.department.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

//    @Autowired
//    DepartmentService departmentService;
//
//    @ResponseBody
//    @RequestMapping(value = "/departments/save/", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
//    public Department saveDepartment(@RequestBody Department department){
//        log.info("Inside saveDepartment  - DepartmentController");
//        return departmentService.saveDepartment(department);
//    }

    @ResponseBody
    @RequestMapping(value = "/departments/{id}", produces = "application/json", method = RequestMethod.GET)
    public Department getDepartmentOnId(@PathVariable("id") Long id){
        log.info("Inside getDepartmentOnId  - DepartmentController");
        return new Department().builder().departmentId(id).build();
    }
}
