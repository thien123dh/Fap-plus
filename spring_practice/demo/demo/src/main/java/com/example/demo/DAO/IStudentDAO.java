package com.example.demo.DAO;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentDAO extends JpaRepository<Student, Long> {
//    //JPQL
//    @Query("SELECT s FROM Student s WHERE s.name LIKE % + :name + %")
//    public List<Student> findByName(@Param("name") String name);
}
