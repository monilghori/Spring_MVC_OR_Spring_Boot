package com.example.RestAPI_Lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students")
    List<Student> getstudents()
    {
       return studentService.getStudent();
    }
    @PostMapping("/student")
    Student addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }
    @DeleteMapping("/{id}")
    void deleteStudent(@PathVariable int id)
    {
        studentService.deleteStudent(id);
    }
}
