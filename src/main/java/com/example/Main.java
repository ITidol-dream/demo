package com.example;

import entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main  {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Student student  = context.getBean(Student.class);

        System.out.println(student);

        System.out.println("welcome");

        context.close();


    }
}