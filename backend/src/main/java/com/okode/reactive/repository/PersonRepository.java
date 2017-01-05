package com.okode.reactive.repository;

import java.util.List;

import com.okode.reactive.model.Person;

public interface PersonRepository {

    Person findOne(int id);
    List<Person> findAll();
    
}
