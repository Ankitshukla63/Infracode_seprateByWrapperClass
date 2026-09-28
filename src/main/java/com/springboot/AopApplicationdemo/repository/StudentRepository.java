package com.springboot.AopApplicationdemo.repository;

import com.springboot.AopApplicationdemo.dto.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository{
    public void save(Student student){
        System.out.println("student save successfully");
    }
}
