package com.vuespringboot.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Cody
 * @date 2020/7/17 - 13:41
 */
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
@Test
    void queryAll(){
    System.out.println(studentRepository.findAll());
}
}