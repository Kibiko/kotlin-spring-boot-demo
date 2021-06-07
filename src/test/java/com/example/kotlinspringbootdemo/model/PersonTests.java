package com.example.kotlinspringbootdemo.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonTests {

    private Person person;
    @BeforeEach
    void jane() {
        person = new Person("Jane", "Doe", 100);
    }

    @Test
    void firstNameTest() {
        Assertions.assertEquals("Jane", person.getFirstName());
        person.setFirstName("Davis");
        Assertions.assertEquals("Davis", person.getFirstName());
    }

    @Test
    void lastNameTest() {
        Assertions.assertEquals("Doe", person.getLastName());
        person.setLastName("Mohar");
        Assertions.assertEquals("Mohar", person.getLastName());
    }

    @Test
    void ageTest() {
        Assertions.assertEquals(100, person.getAge());
        person.setAge(2);
        Assertions.assertEquals(2, person.getAge());
    }

    @Test
    void toStringTest() {
        Assertions.assertEquals("Jane Doe", person.toString());
    }
}
