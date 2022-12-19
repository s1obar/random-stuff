package com.example.controller;

import com.example.controller.globalexception.GlobalExceptionHandler;
import com.example.controller.globalexception.UserNotFoundException;
import com.example.domain.model.User;
import com.example.domain.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * {@ControllerAdvice} annotation used in {@link GlobalExceptionHandler}
 * for exception handling when trying to get user by name.
 * **/
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsersController {

    private final UserService userService;

    @GetMapping(value = "/{name}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches specific user by name from db.",
            notes = "Dummy data used at the moment.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Not found")
    })

    public List<User> getUserByName(@PathVariable String name) throws UserNotFoundException {
           return userService.getUserByName(name);
    }
}
