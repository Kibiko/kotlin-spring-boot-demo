package com.example.kotlinspringbootdemo.service

import com.example.kotlinspringbootdemo.model.Person
import org.springframework.stereotype.Service

@Service
class PersonService {
    val people = ArrayList<Person>()

    fun addPerson(person: Person): Person {
        people.add(person)
        return person
    }

}
