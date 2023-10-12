package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Persondao;
import com.example.demo.model.Person;
@Service
public class PersonService {
    private final Persondao persondao;

    public PersonService(@Qualifier("mongo")Persondao persondao) {
        this.persondao = persondao;
    }
    public int addPerson(Person person){
        return persondao.insertPerson(person);
    }
}
