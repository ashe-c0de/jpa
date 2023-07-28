package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Void register() {
        String random = UUID.randomUUID().toString();
        User user = new User();
        user.setFirstname("Xi");
        user.setLastname("littleRed");
        user.setEmail(String.format("%s@qq.com", random.substring(random.length() - 4)));
        user.setPassword("123456");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        userRepository.save(user);
        return null;
    }

    public Page<User> listStu() {
        Pageable pageable = PageRequest.of(0, 10);
        return userRepository.findAll(pageable);
    }
}
