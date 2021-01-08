package com.example.demo.controllers;

import com.example.demo.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class PersonController {

    @Resource
    private PersonRepository personRepo;

    @RequestMapping("/new-employee-submission")
    public String displayFormFormNewEmployeeSubmission(){
        return "new-employee-submission";


    }
}
