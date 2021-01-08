package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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


    public Company(){
    }

    public Company(String companyName){
        this.companyName = companyName;
    }


}
