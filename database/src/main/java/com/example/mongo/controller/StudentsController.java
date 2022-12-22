package com.example.mongo.controller;

import com.example.mongo.domain.model.Student;
import com.example.mongo.infrastructure.document.StudentDocument;
import com.example.mongo.domain.service.StudentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentsController {

    private final StudentService userService;

    @GetMapping(value = "/{lastName}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches student by last name from mongo db.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Not found")
    })

    public List<Student> getAllByLastName(@PathVariable String lastName){
           return userService.getAllByLastName(lastName);
    }
}
