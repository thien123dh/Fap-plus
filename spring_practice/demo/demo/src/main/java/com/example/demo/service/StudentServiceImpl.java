package com.example.demo.service;

import com.example.demo.DAO.IStudentDAO;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    IStudentDAO studentDAO;
    @Override
    public List<Student> getAllStudent() {
        return studentDAO.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> student = studentDAO.findById(id);

        return (student == null) ? null : student.get();
    }
}
