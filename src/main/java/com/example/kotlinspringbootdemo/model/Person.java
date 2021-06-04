package com.example.kotlinspringbootdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastName,
            @JsonProperty("age") int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}