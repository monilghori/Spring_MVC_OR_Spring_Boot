package org.example;

import org.example.beans.BtechStudent;
import org.example.beans.Student;
import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
//        Student s = app.getBean(BtechStudent.class);
//        Student s = app.getBean(Student.class);
        Student s = (Student) app.getBean("BtechStudent");
        System.out.println(s.getStatus());
    }
}