package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class UsersControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getUserByNameHttpRequestWithStatus200() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/users/user/{name}", "antonija"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").value("antonija"))
                .andReturn();
    }

    @Test
    public void getUserByNameHttpWrongRequestWithStatus404() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/users/user/{name}", "jura"))
                .andExpect(status().is4xxClientError())
                .andReturn();
    }
}
