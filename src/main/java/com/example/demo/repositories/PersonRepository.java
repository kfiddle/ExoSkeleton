package com.example.demo.repositories;

import com.example.demo.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Person findByLastName(String lastName);
}
