package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Getter(AccessLevel.NONE)
    private Long id;
    private String name;
    private Integer classId;
    private Integer yearOfBirth;
}
