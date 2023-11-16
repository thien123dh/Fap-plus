package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/public")
public class PublicController {
    @Autowired
    IStudentService studentService;
    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") Long id) {
        return studentService.getStudentById(id);
    }

}
