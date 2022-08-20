package com.niit.example.JwtDemo.controller;

import com.niit.example.JwtDemo.model.User;
import com.niit.example.JwtDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //@CrossOrigin(origins = "http://localhost:7811")
    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.FOUND);
    }

    @GetMapping("/users/{emailAddress}")
    public ResponseEntity<?> getUserByUserName(@PathVariable String emailAddress) {
        return new ResponseEntity<>(userService.findByEmailAddress(emailAddress), HttpStatus.OK);
    }
}
