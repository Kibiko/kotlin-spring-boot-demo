package com.example.kotlinspringbootdemo.controller;

import com.example.kotlinspringbootdemo.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void ping() throws Exception {

        mockMvc.perform(
                MockMvcRequestBuilders.get("/api/ping"))
                .andExpect(status().isOk())
                .andExpect(content().string("pong"));
    }

    @Test
    public void addAndGetPeople() throws Exception {
        Person Jane = new Person("Jane", "Doe", 100);
        String body = "{\n" +
                "\t\"firstName\": \"Jane\",\n" +
                "\t\"lastName\": \"Doe\",\n" +
                "\t\"age\": 100\n" +
                "}";

        mockMvc.perform(
                MockMvcRequestBuilders.post("/api/people/add").content(body).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(Jane.toString()));

        String expectedResponse = "[{\"firstName\":\"Jane\",\"lastName\":\"Doe\",\"age\":100}]";
        mockMvc.perform(MockMvcRequestBuilders.get("/api/people"))
                .andExpect(content().string(expectedResponse));
    }

}
