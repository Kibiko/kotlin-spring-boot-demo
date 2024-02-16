package com.example.kotlinspringbootdemo.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Person( //primary constructor with properties incorporation into class header
    @JsonProperty("firstName") var firstName : String, //variable names with data types specified
    @JsonProperty("lastName") var lastName: String,
    @JsonProperty("age") var age: Int
) {
    override fun toString(): String { //function declaration
        return "$firstName $lastName"
    }
}