package com.example;

import entity.ArtTeacher;
import entity.ProgramTeacher;
import entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main  {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Student student  = context.getBean(Student.class);
        ArtTeacher artTeacher = context.getBean(ArtTeacher.class);
        ProgramTeacher programTeacher = context.getBean(ProgramTeacher.class);


        System.out.println(artTeacher);
        System.out.println(programTeacher);
        System.out.println(student);

        System.out.println("welcome");

        context.close();


    }
}