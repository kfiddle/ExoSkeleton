package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private Long id;
    private String companyName;

    @OneToMany(mappedBy = "company")
    private Collection<Person> employees;

    public Long getId() {
        return id;
    }
    public String getCompanyName(){
        return companyName;
    }

    public Collection<Person> getEmployees() {
        return employees;
    }

    public Person findByFirstAndLastName(String firstName, String lastName){
        Person personToFind = new Person();
        for (Person person : employees) {
            if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
                personToFind = person;
            }
        } return personToFind;
    }


    public Company(){
    }

    public Company(String companyName){
        this.companyName = companyName;
    }

    public Company(String companyName, Person...employees){
        this.companyName = companyName;
        this.employees = Arrays.asList(employees);
    }





}
