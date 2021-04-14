package com.example.kotlinspringbootdemo.service;


import com.example.kotlinspringbootdemo.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonService {
    private ArrayList<Person> people;

    public PersonService() {
        people = new ArrayList<>();
    }

    public ArrayList<Person> getPeople() {
        return this.people;
    }

    public Person addPerson(Person person) {
        this.people.add(person);
        return person;
    }
}