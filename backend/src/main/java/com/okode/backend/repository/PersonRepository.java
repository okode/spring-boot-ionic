package com.okode.backend.repository;

import java.util.List;

import com.okode.backend.model.Person;

public interface PersonRepository {

    Person findOne(int id);
    List<Person> findAll();
    
}
