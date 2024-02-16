package com.example.kotlinspringbootdemo.controller

import com.example.kotlinspringbootdemo.model.Person
import com.example.kotlinspringbootdemo.service.PersonService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/api")
class PersonController {
    val personService = PersonService()

    @GetMapping("/ping")
    fun ping(): ResponseEntity<String> {
        return ResponseEntity("pong", HttpStatus.OK)
    }

    @GetMapping("/people")
    @ResponseBody
    fun getPeople(): ResponseEntity<ArrayList<Person>> {
        return ResponseEntity(personService.people, HttpStatus.OK)
    }

    @PostMapping("/people/add")
    fun addPerson(@RequestBody person: Person): ResponseEntity<String> {
        return ResponseEntity(personService.addPerson(person).toString(), HttpStatus.OK)
    }
}