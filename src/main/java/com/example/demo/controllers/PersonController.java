package com.example.demo.controllers;

import com.example.demo.models.Company;
import com.example.demo.models.Person;
import com.example.demo.repositories.CompanyRepository;
import com.example.demo.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/employee/{lastName}/{id}")
    public String displayThankYouPageForSubmission(@PathVariable Long id, Model model) {
        Person person = personRepo.findById(id).get();
        model.addAttribute("person", person);
        return "newEmployeePage";

    }

    @PostMapping("/add-person")
    public String displayAddEmployeeForm(@RequestParam String firstName, String lastName, String email, int age, String company, int height, int weight, int waist, int gender,
                                         int years, int overallEffort,
                                         int typicalLiftEffort, int heaviestLiftEffort, int rightShoulderDiscomfort, int leftShoulderDiscomfort,
                                         int upperBackDiscomfort, int lowerBackDiscomfort, int rightHipDiscomfort, int leftHipDiscomfort,
                                         int rightThighDiscomfort, int leftThighDiscomfort, int rightKneeDiscomfort, int leftKneeDiscomfort) {

        String newLastName = lastName;
        Company foundCompany;

        if (companyRepo.findByCompanyName(company) == null) {
            foundCompany = new Company(company);
            companyRepo.save(foundCompany);
        } else {
            foundCompany = companyRepo.findByCompanyName(company);
        }
        Person personToAdd = new Person(firstName, lastName, foundCompany, email, height, weight, waist,
                age, gender, years, overallEffort, typicalLiftEffort,
                heaviestLiftEffort, rightShoulderDiscomfort, leftShoulderDiscomfort, upperBackDiscomfort,
                lowerBackDiscomfort, rightHipDiscomfort, leftHipDiscomfort, rightThighDiscomfort,
                leftThighDiscomfort, rightKneeDiscomfort, leftKneeDiscomfort);

        personRepo.save(personToAdd);
        newLastName = personToAdd.getLastName();
        return "redirect:/employee/" + newLastName + "/" + personToAdd.getId();
    }

    @RequestMapping("/all-people")
    public String displayAllUsersInDatabase(Model model) {
        model.addAttribute("allPeople", personRepo.findAll());
        return "allPeople";
    }


}

