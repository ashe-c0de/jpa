package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
@Slf4j
class FunnyTest {
    
    @Test
    void test () {
        Assertions.assertDoesNotThrow(() -> {
            int[] arr = {1, 2, 3};
            int i = Arrays.binarySearch(arr, 2);
            log.info("i = {}", i);
        });
    }

}
