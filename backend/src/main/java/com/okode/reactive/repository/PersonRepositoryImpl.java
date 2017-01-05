package com.okode.reactive.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.okode.reactive.model.Person;

@Component
public class PersonRepositoryImpl implements PersonRepository {

    private final Map<Integer, Person> people = new HashMap<>();
    
    public PersonRepositoryImpl() {
        people.put(0, new Person("John", 25));
        people.put(1, new Person("James", 32));
        people.put(2, new Person("Matt", 29));
    }
    
    @Override
    public Person findOne(int id) {
        return people.get(id);
    }

    @Override
    public List<Person> findAll() {
        return new ArrayList<>(people.values());
    }

}
