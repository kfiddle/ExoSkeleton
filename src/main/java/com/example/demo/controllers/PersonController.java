package com.example.demo.controllers;

import com.example.demo.models.Company;
import com.example.demo.models.Person;
import com.example.demo.repositories.CompanyRepository;
import com.example.demo.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class PersonController {

    @Resource
    private PersonRepository personRepo;

    @Resource
    private CompanyRepository companyRepo;

    @RequestMapping("/new-employee-submission")
    public String displayFormFormNewEmployeeSubmission() {
        return "new-employee-submission";

    }

    @PostMapping("/add-person")
    public String displayAddEmployeeForm(@RequestParam String firstName, String lastName, String email, int age, String company,
                                int height, int weight, int waist, int gender, int years, int overallEffort,
                                int typicalLiftEffort, int heaviestLiftEffort, int rightShoulderDiscomfort, int leftShoulderDiscomfort,
                                int upperBackDiscomfort, int lowerBackDiscomfort, int rightHipDiscomfort, int leftHipDiscomfort,
                                int rightThighDiscomfort, int leftThighDiscomfort, int rightKneeDiscomfort, int leftKneeDiscomfort);
    if (companyRepo.findByCompanyName(company) == null)){}
    Company companyToAdd = new Company()


    Person personToAdd = (firstName, lastName, Company company, String email, int height, int weight, int waist, int age, int gender, int yearsAtCurrentJob, int overallWorkEffort, int typicalLiftEffort, int heaviestLiftEffort, int rightShoulderDiscomfort, int leftShoulderDiscomfort, int upperBackDiscomfort, int lowerBackDiscomfort, int rightHipDiscomfort, int leftHipDiscomfort, int rightThighDiscomfort, int leftThighDiscomfort, int rightKneeDiscomfort, int leftKneeDiscomfort) {




        return"thankYouPage";


}

