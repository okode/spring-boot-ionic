package com.okode.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.okode.backend.model.Person;
import com.okode.backend.service.PersonService;

@RestController
@CrossOrigin
@RequestMapping("/people")
public class PersonController {

    private final PersonService personService;
    
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    
    @GetMapping /* (produces = "text/event-stream") */
    public List<Person> findAll() {
        return personService.findAll();
    }
    
    @GetMapping("/{id}")
    public Person findOne(@PathVariable int id) {
        return personService.findOne(id);
    }
    
}
