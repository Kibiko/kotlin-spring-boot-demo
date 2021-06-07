package com.example.kotlinspringbootdemo.service;

import com.example.kotlinspringbootdemo.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonServiceTests {

    private final PersonService personService = new PersonService();

    @Test
    public void personServiceTest() {
        ArrayList<Person> list = new ArrayList<>();
        Assertions.assertEquals(list, personService.getPeople());
        Person jane = new Person("Jane", "Doe", 100);
        Assertions.assertEquals(jane, personService.addPerson(jane));
        list.add(jane);
        Assertions.assertEquals(list, personService.getPeople());
    }
}
