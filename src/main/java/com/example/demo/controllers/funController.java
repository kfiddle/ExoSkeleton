package com.example.demo.controllers;

import com.example.demo.models.Person;
import com.example.demo.repositories.PersonRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class funController {

    @Resource
    private PersonRepository personRepo;

    @PostMapping("/add-short-person")
    public String addAForm(@RequestBody Person...persons) {
        for (Person person : persons)
        personRepo.save(person);
        return "/all-people";
    }



}
