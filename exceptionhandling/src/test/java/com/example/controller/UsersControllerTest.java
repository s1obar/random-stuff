package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@SpringBootTest
public class UsersControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getUserByNameHttpRequestWithStatus200() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/users/user/{name}", "antonija"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].id").value(2L))
                .andExpect(jsonPath("$[0].name").value("Antonija"));
    }

    @Test
    public void getUserByNameHttpWrongRequestWithStatus404() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/users/user/{name}", "jura"))
                .andExpect(status().is4xxClientError())
                .andReturn();
    }
}
