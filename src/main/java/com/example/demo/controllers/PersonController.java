package com.example.demo.controllers;

import com.example.demo.models.Company;
import com.example.demo.models.Person;
import com.example.demo.repositories.CompanyRepository;
import com.example.demo.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;

@Controller
public class PersonController {

    @Resource
    private PersonRepository personRepo;

    @Resource
    private CompanyRepository companyRepo;

    @RequestMapping("/new-employee-long")
    public String displayFormFormNewEmployeeSubmission() {
        return "markNewPersonSubmission";
    }

    @RequestMapping("/new-employee-short")
    public String displayShortNewPersonForm() {
        return "newPersonShortVersion";
    }


    @RequestMapping("/employee/{lastName}/{id}")
    public String displayThankYouPageForSubmission(@PathVariable Long id, Model model) {
        Person person = personRepo.findById(id).get();
        model.addAttribute("person", person);
        return "newEmployeePage";
    }


    @PostMapping("/add-person")
    public String displayAddEmployeeForm(@RequestParam String firstName, String lastName, String company, String email,
                                         int age, int height, int weight, int waist, int gender, int years, int overallEffort, int typicalLiftEffort, int heaviestLiftEffort,
                                         int rightShoulderDiscomfort, int leftShoulderDiscomfort, int upperBackDiscomfort, int lowerBackDiscomfort, int rightHipDiscomfort,
                                         int leftHipDiscomfort, int rightThighDiscomfort, int leftThighDiscomfort, int rightKneeDiscomfort, int leftKneeDiscomfort) {

        Person personToAdd;
        String newLastName = lastName;
        Company foundCompany;
        String returnStatement = "redirect:/employee/" + newLastName + "/";

        if (email == null && company == null) {
            personToAdd = new Person(firstName, lastName);
            return returnStatement + personToAdd.getId();
        }

        if (companyRepo.findByCompanyName(company) == null) {
            foundCompany = new Company(company);
            companyRepo.save(foundCompany);
        } else {
            foundCompany = companyRepo.findByCompanyName(company);
        }


        personToAdd = new Person(firstName, lastName, foundCompany, email, height, weight, waist,
                age, gender, years, overallEffort, typicalLiftEffort,
                heaviestLiftEffort, rightShoulderDiscomfort, leftShoulderDiscomfort, upperBackDiscomfort,
                lowerBackDiscomfort, rightHipDiscomfort, leftHipDiscomfort, rightThighDiscomfort,
                leftThighDiscomfort, rightKneeDiscomfort, leftKneeDiscomfort);

        personRepo.save(personToAdd);
        newLastName = personToAdd.getLastName();
        return returnStatement + personToAdd.getId();
    }

    @RequestMapping("/all-people")
    public String displayAllUsersInDatabase(Model model) {
        model.addAttribute("allPeople", personRepo.findAll());
        return "allPeople";
    }

    @PostMapping("/add-short-person")
    public String addAForm(@RequestBody Person... persons) {
        for (Person person : persons) {

            personRepo.save(person);
        }
        return "redirect:/all-people";

    }
}

//    Company foundCompany = new Company();
//
//            if (companyRepo.findByCompanyName(person.getCompanyName()) == null) {
//                    foundCompany = new Company(person.getCompanyName());
//                    companyRepo.save(foundCompany);
//                    } else {
//                    foundCompany = new Company(person.getCompanyName());
//                    }
//Person personToAdd = new Person(person.getFirstName(), person.getLastName(), person.getCompanyName());
