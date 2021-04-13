package com.example.kotlinspringbootdemo.service;


import com.example.kotlinspringbootdemo.model.JavaPerson;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JavaPersonService {
    private ArrayList<JavaPerson> people;

    public JavaPersonService() {
        people = new ArrayList<>();
    }

    public ArrayList<JavaPerson> getPeople() {
        return this.people;
    }

    public JavaPerson addPerson(JavaPerson javaPerson) {
        this.people.add(javaPerson);
        return javaPerson;
    }
}