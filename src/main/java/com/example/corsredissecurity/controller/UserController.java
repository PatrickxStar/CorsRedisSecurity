package com.example.corsredissecurity.controller;

import com.example.corsredissecurity.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John Doe", "john@example.com"));
        users.add(new User(2, "Jane Smith", "jane@example.com"));
        return users;
    }
}
