package com.okode.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okode.backend.model.Person;
import com.okode.backend.repository.PersonRepository;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    
    public Person findOne(int id) {
        return personRepository.findOne(id);
    }
    
    public List<Person> findAll() {
        return personRepository.findAll();
    }
    
}
