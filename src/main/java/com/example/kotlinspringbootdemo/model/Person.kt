package com.example.kotlinspringbootdemo.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Person(
    @JsonProperty("firstName") var firstName : String,
    @JsonProperty("lastName") var lastName: String,
    @JsonProperty("age") var age: Int
) {
    override fun toString(): String {
        return "$firstName $lastName"
    }
}