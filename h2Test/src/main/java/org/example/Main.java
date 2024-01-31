package org.example;


import org.example.DAO.StudentDAO;
import org.example.DAO.StudentDAOImpl;
import org.example.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Configuration config  = new Configuration();
        config.configure();
//        config.addAnnotatedClass(Student.class);

        SessionFactory sessionFactory = config.buildSessionFactory();

        try (sessionFactory) {
            StudentDAO studentDAO = new StudentDAOImpl(sessionFactory);
            Student s = new Student();
            s.setName("Monil");

            studentDAO.saveStudent(s);

            List<Student> students = studentDAO.getAllStudents();
            System.out.println("students" + students.toString());

            Student studentToUpdate = studentDAO.getStudentById(1);
            System.out.println("Updating student " + studentToUpdate);
            if (studentToUpdate != null) {
                studentToUpdate.setName("Monil Ghori");
                studentDAO.updateStudent(studentToUpdate);
            }

            Student updatedStudent = studentDAO.getStudentById(1);
            System.out.println("Updated student = " + updatedStudent);

//            studentDAO.deleteStudent(1);
//            System.out.println("Deleting student with id = " + 2);
//            List<Student> studentsAfterDelete = studentDAO.getAllStudents();
//            System.out.println("Students: " + studentsAfterDelete.toString());
        }
    }
}
