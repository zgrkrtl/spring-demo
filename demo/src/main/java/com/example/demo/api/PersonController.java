package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

public class PersonController {
    private final PersonService personservice;
    public PersonController(PersonService personservice) {
        this.personservice=personservice;
    }
    public void addPerson(Person person){
        personservice.addPerson(person);
        }
}
