package com.example.controller;

import com.example.domain.model.ExceptionInfo;
import com.example.controller.localexception.CustomerNotFoundException;
import com.example.domain.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;

/**
 * {@ExceptionHandler} annotation used locally in this class. Annotation {@ControllerAdvice} was not used for exception handling.
 * **/

@RestController
@RequestMapping(path = "/api/v1/customers")
@RequiredArgsConstructor
public class CustomersController {

    private final CustomerService customerService;


    @GetMapping(value = "/customer/{name}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches specific customer by name from db.",
            notes = "Dummy data used at the moment.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Not found")
    })
    public String getCustomerByName(@PathVariable String name) throws CustomerNotFoundException {
        return customerService.getCustomerByName(name);
    }

    @ExceptionHandler(value = {CustomerNotFoundException.class})
    public ResponseEntity<Object> handleCustomerNotFoundException(CustomerNotFoundException e){
        HttpStatus badRequestStatus = HttpStatus.NOT_FOUND;
        ExceptionInfo exception = ExceptionInfo.builder()
                .message(e.getMessage())
                .httpStatus(HttpStatus.NOT_FOUND)
                .timestamp(ZonedDateTime.now()).build();
        return new ResponseEntity<>(exception, badRequestStatus);
    }
}