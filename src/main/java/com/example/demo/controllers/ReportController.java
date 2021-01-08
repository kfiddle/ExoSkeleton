package com.example.demo.controllers;

import com.example.demo.repositories.ReportRepository;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class ReportController {

    @Resource
    private ReportRepository reportRepo;
}

