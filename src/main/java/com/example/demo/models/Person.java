package com.example.demo.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    @ManyToOne
    private Company company;
    private String email;
    private int height;
    private int weight;
    private int waist;
    private int age;
    private int gender;
    private int yearsAtCurrentJob;
    private int overallWorkEffort;
    private int typicalLiftEffort;
    private int heaviestLiftEffort;
    private int rightShoulderDiscomfort;
    private int leftShoulderDiscomfort;
    private int upperBackDiscomfort;
    private int lowerBackDiscomfort;
    private int rightHipDiscomfort;
    private int leftHipDiscomfort;
    private int rightThighDiscomfort;
    private int leftThighDiscomfort;
    private int rightKneeDiscomfort;
    private int leftKneeDiscomfort;

    @OneToMany
    private Collection<Report> reports;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Company getCompany() {
        return company;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getWaist() {
        return waist;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public int getYearsAtCurrentJob() {
        return yearsAtCurrentJob;
    }

    public int getOverallWorkEffort() {
        return overallWorkEffort;
    }

    public int getTypicalLiftEffort() {
        return typicalLiftEffort;
    }

    public int getHeaviestLiftEffort() {
        return heaviestLiftEffort;
    }

    public int getRightShoulderDiscomfort() {
        return rightShoulderDiscomfort;
    }

    public int getLeftShoulderDiscomfort() {
        return leftShoulderDiscomfort;
    }

    public int getUpperBackDiscomfort() {
        return upperBackDiscomfort;
    }

    public int getLowerBackDiscomfort() {
        return lowerBackDiscomfort;
    }

    public int getRightHipDiscomfort() {
        return rightHipDiscomfort;
    }

    public int getLeftHipDiscomfort() {
        return leftHipDiscomfort;
    }

    public int getRightThighDiscomfort() {
        return rightThighDiscomfort;
    }

    public int getLeftThighDiscomfort() {
        return leftThighDiscomfort;
    }

    public int getRightKneeDiscomfort() {
        return rightKneeDiscomfort;
    }

    public int getLeftKneeDiscomfort() {
        return leftKneeDiscomfort;
    }

    public Collection<Report> getReports() {
        return reports;
    }


    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Company company){
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

    public Person(String firstName, String lastName, String email, int height, int weight, int waist, int age, int gender, int yearsAtCurrentJob, int overallWorkEffort, int typicalLiftEffort, int heaviestLiftEffort, int rightShoulderDiscomfort, int leftShoulderDiscomfort, int upperBackDiscomfort, int lowerBackDiscomfort, int rightHipDiscomfort, int leftHipDiscomfort, int rightThighDiscomfort, int leftThighDiscomfort, int rightKneeDiscomfort, int leftKneeDiscomfort) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.waist = waist;
        this.age = age;
        this.gender = gender;
        this.yearsAtCurrentJob = yearsAtCurrentJob;
        this.overallWorkEffort = overallWorkEffort;
        this.typicalLiftEffort = typicalLiftEffort;
        this.heaviestLiftEffort = heaviestLiftEffort;
        this.rightShoulderDiscomfort = rightShoulderDiscomfort;
        this.leftShoulderDiscomfort = leftShoulderDiscomfort;
        this.upperBackDiscomfort = upperBackDiscomfort;
        this.lowerBackDiscomfort = lowerBackDiscomfort;
        this.rightHipDiscomfort = rightHipDiscomfort;
        this.leftHipDiscomfort = leftHipDiscomfort;
        this.rightThighDiscomfort = rightThighDiscomfort;
        this.leftThighDiscomfort = leftThighDiscomfort;
        this.rightKneeDiscomfort = rightKneeDiscomfort;
        this.leftKneeDiscomfort = leftKneeDiscomfort;
    }

    public Person(String firstName, String lastName, Company company, String email, int height, int weight, int waist, int age, int gender, int yearsAtCurrentJob, int overallWorkEffort, int typicalLiftEffort, int heaviestLiftEffort, int rightShoulderDiscomfort, int leftShoulderDiscomfort, int upperBackDiscomfort, int lowerBackDiscomfort, int rightHipDiscomfort, int leftHipDiscomfort, int rightThighDiscomfort, int leftThighDiscomfort, int rightKneeDiscomfort, int leftKneeDiscomfort) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.waist = waist;
        this.age = age;
        this.gender = gender;
        this.yearsAtCurrentJob = yearsAtCurrentJob;
        this.overallWorkEffort = overallWorkEffort;
        this.typicalLiftEffort = typicalLiftEffort;
        this.heaviestLiftEffort = heaviestLiftEffort;
        this.rightShoulderDiscomfort = rightShoulderDiscomfort;
        this.leftShoulderDiscomfort = leftShoulderDiscomfort;
        this.upperBackDiscomfort = upperBackDiscomfort;
        this.lowerBackDiscomfort = lowerBackDiscomfort;
        this.rightHipDiscomfort = rightHipDiscomfort;
        this.leftHipDiscomfort = leftHipDiscomfort;
        this.rightThighDiscomfort = rightThighDiscomfort;
        this.leftThighDiscomfort = leftThighDiscomfort;
        this.rightKneeDiscomfort = rightKneeDiscomfort;
        this.leftKneeDiscomfort = leftKneeDiscomfort;

    }
}
