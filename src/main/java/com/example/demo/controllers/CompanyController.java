package com.example.demo.controllers;


import com.example.demo.repositories.CompanyRepository;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class CompanyController {

    @Resource
    private CompanyRepository companyRepo;
}
