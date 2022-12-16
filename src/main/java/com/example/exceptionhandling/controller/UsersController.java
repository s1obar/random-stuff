package com.example.exceptionhandling.controller;

import com.example.exceptionhandling.domain.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsersController {

    private final UserService userService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches all users from db.",
            notes = "Dummy data used at the moment.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
    })
    public List<String> getAllUsers(){
        return userService.getAll();
    }

    @GetMapping(value = "/user/{name}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches specific user by name from db.",
            notes = "Dummy data used at the moment.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Not found")
    })

    public String getUserByName(@PathVariable String name){
           return userService.getUserByName(name);
    }
}