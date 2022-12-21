package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@SpringBootTest
public class CustomersControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getCustomerByIdHttpRequestWithStatus200() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/customers/{id}", "2"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.id").value("2"))
                .andExpect(jsonPath("$.name").value("Jurek"))
                .andReturn();
    }

    @Test
    public void getCustomerByIdHttpWrongRequestWithStatus404() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/customers/{id}", "4"))
                .andExpect(status().is(404));
    }
}
