package com.example.demo.controller;

import com.example.demo.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/access")
public class AccessController {

    @Resource
    private StudentService studentService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello () {
        return ResponseEntity.ok("hello JPA");
    }

    @GetMapping("/register")
    public ResponseEntity<Void> register () {
        return ResponseEntity.ok(studentService.register());
    }

    @GetMapping("/list")
    public ResponseEntity<Map<String, Object>> listStu () {
        return ResponseEntity.ok(studentService.listStu());
    }
}
