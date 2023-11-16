package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> getAllStudent();

    public Student getStudentById(Long id);
}
