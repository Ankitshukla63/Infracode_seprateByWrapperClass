package com.springboot.AopApplicationdemo.service;

// in util class we create method static so does not need component
public  class loggingServiceUtil {

    public static  void logStart(String className, String methodName){
        System.out.println("Executing --> " + className + " " + methodName);
    }
    public static  void logEnd(String className, String methodName){
        System.out.println("Finishing --> " + className + " " + methodName);
    }
}
