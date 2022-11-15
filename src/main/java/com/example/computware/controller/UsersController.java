package com.example.computware.controller;

import com.example.computware.dto.addUserDto;
import com.example.computware.model.Users;
import com.example.computware.service.UsersDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/")
public class UsersController {

    @Autowired
    UsersDataService usersDataService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody addUserDto userDto) throws Exception {
        usersDataService.addUser(userDto);
    }
    @GetMapping("/get")
    public List<Users> get( ){
       return usersDataService.get();
    }
}
