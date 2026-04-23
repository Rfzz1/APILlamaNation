
package com.example.llamanation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.llamanation.dto.UserDTO;
import com.example.llamanation.service.UserService;
import com.example.llamanation.database.model.User;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User cadastrar(@RequestBody UserDTO dto) {
        return service.cadastrar(dto);
    }
}