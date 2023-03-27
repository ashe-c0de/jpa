package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import jakarta.annotation.Resource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class StudentService {

    @Resource
    private StudentRepository studentRepository;

    public Void register() {
        Student student = new Student(
                "littleRed",
                "Xi",
                "red@qq.com",
                18
        );
        studentRepository.save(student);
        return null;
    }

    public Map<String, Object> listStu() {
        HashMap<String, Object> map = new HashMap<>();
        Pageable pageable = PageRequest.of(1, 10);
        map.put("page", studentRepository.findAll(pageable));
        map.put("content", studentRepository.findAll(Sort.unsorted()));
        return map;
    }
}
