package com.example.users.controller;

import com.example.users.entity.Users;
import com.example.users.service.UsersService;
import com.example.users.valueObject.ResponseValueObject;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class UsersController {

    @Autowired
    UsersService usersService;

    @ResponseBody
    @RequestMapping(value = "/users/save/", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
    public Users saveUser(@RequestBody Users users){
        log.info("Inside saveUser  - UserController");
        return usersService.saveUser(users);
    }

    @ResponseBody
    @RequestMapping(value = "/users/{id}", produces = "application/json", consumes = "application/json", method = RequestMethod.GET)
    public Users getUserOnId(@PathVariable("id") Long id){
        log.info("Inside getUserOnId  - UserController");
        return  usersService.getUserById(id);
    }

    @ResponseBody
    //@CircuitBreaker(name = "user-service", fallbackMethod = "getUserWithDepartmentOnUserIdFallBack")
    @RequestMapping(value = "/users/usersWithDept/{id}", produces = "application/json", consumes = "application/json", method = RequestMethod.GET)
    public ResponseValueObject getUserWithDepartmentOnUserId(@PathVariable("id") Long id){
        log.info("Inside getUserWithDepartmentOnUserId  - UserController");
        return  usersService.getUserWithDepartmentOnUserId(id);
    }

    //CIRCUIT BREAKER
//    public ResponseValueObject getUserWithDepartmentOnUserIdFallBack(Exception e){
//        ResponseValueObject rvo = new ResponseValueObject();
//        rvo.setErrorResponse("user-service Fallback - Its Down");
//        return rvo;
//    }


}
