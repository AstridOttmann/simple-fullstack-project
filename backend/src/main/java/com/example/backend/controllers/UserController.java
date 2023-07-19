package com.example.backend.controllers;

import com.example.backend.entities.User;
import com.example.backend.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<String> getUserById(@PathVariable Long id){
        return new ResponseEntity<>(userService.getUserById(id).getUsername(), HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<HttpStatus> signUp(@RequestBody User user) {
        userService.saveUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
