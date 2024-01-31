package org.example.entities;

import jakarta.persistence.*;
import org.example.entities.Student_Details;

@Entity
public class Student {
    @Id
    private int id;
    @Column(name = "STUDENT_NAME")
    private  String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "STDETAIL_FK")
    private Student_Details student_details;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student_Details getStudent_details() {
        return student_details;
    }

    public void setStudent_details(Student_Details student_details) {
        this.student_details = student_details;
    }
}
