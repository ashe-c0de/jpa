package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/access")
@RequiredArgsConstructor
public class AccessController {

    private final UserService userService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello () {
        return ResponseEntity.ok("hello JPA");
    }

    @GetMapping("/register")
    public ResponseEntity<Void> register () {
        return ResponseEntity.ok(userService.register());
    }

    @GetMapping("/list")
    public ResponseEntity<Page<User>> listStu () {
        return ResponseEntity.ok(userService.listStu());
    }
}
