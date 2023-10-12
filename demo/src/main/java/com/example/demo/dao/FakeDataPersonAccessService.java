package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public class FakeDataPersonAccessService implements Persondao{


    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
    
}
