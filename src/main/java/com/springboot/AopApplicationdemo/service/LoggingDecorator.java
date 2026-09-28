package com.springboot.AopApplicationdemo.service;

import com.springboot.AopApplicationdemo.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LoggingDecorator implements StudentService{

    private StudentServiceImpl studentServiceImpl;
    @Autowired
    public LoggingDecorator(StudentServiceImpl studentServiceImpl){
        this.studentServiceImpl=studentServiceImpl;
    }

    @Override
    public void createStudent(Student student) {
        loggingServiceUtil.logStart(
                "LoggingDecorator", "createStudent");

        studentServiceImpl.createStudent(student);

        loggingServiceUtil.logEnd(
                "LoggingDecorator", "createStudent");


    }
}
