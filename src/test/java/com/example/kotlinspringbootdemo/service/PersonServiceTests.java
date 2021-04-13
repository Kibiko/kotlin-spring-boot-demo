package com.example.kotlinspringbootdemo.service;

import com.example.kotlinspringbootdemo.model.JavaPerson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonServiceTests {

    private final JavaPersonService personService = new JavaPersonService();

    @Test
    public void personServiceTest() {
        ArrayList<JavaPerson> list = new ArrayList<>();
        Assertions.assertEquals(list, personService.getPeople());
        JavaPerson jane = new JavaPerson("Jane", "Doe", 100);
        Assertions.assertEquals(jane, personService.addPerson(jane));
        list.add(jane);
        Assertions.assertEquals(list, personService.getPeople());


    }
}
