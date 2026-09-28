package com.springboot.AopApplicationdemo.service;


import com.springboot.AopApplicationdemo.dto.Student;
import com.springboot.AopApplicationdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }


    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }
}
