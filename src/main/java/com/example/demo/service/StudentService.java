package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Void register() {
        String random = UUID.randomUUID().toString();
        String email = random.substring(random.length() - 4);
        Student student = new Student(
                "littleRed",
                "Xi",
                String.format("%s@qq.com", email),
                18
        );
        studentRepository.save(student);
        return null;
    }

    public Page<Student> listStu() {
        Pageable pageable = PageRequest.of(0, 10);
        return studentRepository.findAll(pageable);
    }
}
