package com.niit.example.JwtDemo.service;


import com.niit.example.JwtDemo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User findByEmailAddress(String emailAddress);
}
