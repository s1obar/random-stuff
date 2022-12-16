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
public class CustomersControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getCustomerByNameHttpRequestWithStatus200() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/customers/customer/{name}", "donald"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").value("donald"))
                .andReturn();
    }

    @Test
    public void getCustomerByNameHttpWrongRequestWithStatus404() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/customers/{name}", "jura"))
                .andExpect(status().is4xxClientError())
                .andReturn();
    }
}
