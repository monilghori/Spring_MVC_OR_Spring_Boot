package org.example.DAO;

import org.example.entities.Student;

import java.util.List;

public interface StudentDAO {
    void saveStudent(Student student);
    Student getStudentById(long id);
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void deleteStudent(long id);
}