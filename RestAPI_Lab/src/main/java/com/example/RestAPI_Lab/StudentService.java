package com.example.RestAPI_Lab;

import java.util.List;

public interface StudentService {
    public List<Student> getStudent();
    public Student addStudent(Student student);
    public void deleteStudent(int id);

}
