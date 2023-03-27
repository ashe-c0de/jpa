package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
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

    private final StudentService studentService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello () {
        return ResponseEntity.ok("hello JPA");
    }

    @GetMapping("/register")
    public ResponseEntity<Void> register () {
        return ResponseEntity.ok(studentService.register());
    }

    @GetMapping("/list")
    public ResponseEntity<Page<Student>> listStu () {
        return ResponseEntity.ok(studentService.listStu());
    }
}
