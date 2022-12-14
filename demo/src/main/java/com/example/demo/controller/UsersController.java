package com.example.demo.controller;

import com.example.demo.controller.exception.UserNotFoundException;
import com.example.demo.domain.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsersController {

    private final UserService userService;

    private final List<String> USERS = Arrays.asList("Aurora", "Antonija", "Manuela");

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches all users from db.",
            notes = "Dummy data used at the moment.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
    })
    public List<String> getAllUsers(){
        return USERS;
    }

    @GetMapping(value = "/user/{name}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches specific user by name from db.",
            notes = "Dummy data used at the moment.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Not found")
    })

    //TODO: this is just for the commit try to see if the contributions are going to be visible
    public ResponseEntity<String> getUserByName(@PathVariable String name) {
        try {
           return new ResponseEntity<>(userService.getUserByName(name), HttpStatus.OK);
        } catch (UserNotFoundException exc) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "We do not have that user in our database!", exc);
        }
    }
}
