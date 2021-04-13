package com.example.kotlinspringbootdemo.controller;

import com.example.kotlinspringbootdemo.model.JavaPerson;
import com.example.kotlinspringbootdemo.service.JavaPersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/api")
public class PersonController {

    JavaPersonService personService = new JavaPersonService();

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return new ResponseEntity<>("pong", HttpStatus.OK);
    }

    @GetMapping("/people")
    @ResponseBody
    public  ResponseEntity<ArrayList<JavaPerson>> getPeople() {
        return new ResponseEntity<>(personService.getPeople(), HttpStatus.OK);
    }

    @PostMapping("/people/add")
    public ResponseEntity<String> addPerson(
            @RequestBody JavaPerson person
    ) {
        try {
            return new ResponseEntity<>(personService.addPerson(person).toString(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Not a valid person object", HttpStatus.BAD_REQUEST);
        }
    }
}
