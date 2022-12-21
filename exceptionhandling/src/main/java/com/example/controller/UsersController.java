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

import javax.persistence.EntityNotFoundException;
import java.util.List;

/**
 * {@RestControllerAdvice} annotation used in {@link GlobalExceptionHandler}
 * for exception handling when trying to get user by id.
 * **/
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsersController {

    private final UserService userService;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches specific user by id from db.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Not found")
    })

    public User getUserById(@PathVariable Long id) throws UserNotFoundException{
           return userService.getUserById(id);
    }
}
