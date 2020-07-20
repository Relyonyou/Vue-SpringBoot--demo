package com.vuespringboot.demo.controller;

import com.vuespringboot.demo.entity.Student;
import com.vuespringboot.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Cody
 * @date 2020/7/17 - 13:45
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository repository;
    @GetMapping("/queryall/{page}/{size}")
    public Page<Student> queryAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Pageable pageable = PageRequest.of(page-1, size);
        return repository.findAll(pageable);
    }
    @PostMapping("/save")
    public String addStu(@RequestBody Student student){
        Student student1 = repository.save(student);
        if(student1!=null){
            return "true";
        }
        return "false";
    }
    @PutMapping("/upd")
    public String upd(@RequestBody Student student){
        Student student1 = repository.save(student);
        if(student1!=null){
            return "true";
        }
        return "false";
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
}
