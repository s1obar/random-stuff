//package com.example.mongo.controller;
//
//import com.example.mongo.domain.model.GroceryItem;
//import com.example.mongo.domain.service.MongoUserService;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/v1/mongo-users")
//@RequiredArgsConstructor
//public class MongoUsersController {
//
//    private final MongoUserService userService;
//
//    @GetMapping(value = "/{name}")
//    @ResponseStatus(HttpStatus.OK)
//    @ApiOperation(value = "Fetches mongo user by name from db.")
//    @ApiResponses({
//            @ApiResponse(code = 200, message = "Success"),
//            @ApiResponse(code = 404, message = "Not found")
//    })
//
//    public GroceryItem getItemByName(@PathVariable String name){
//           return userService.getUserByName(name);
//    }
//}
