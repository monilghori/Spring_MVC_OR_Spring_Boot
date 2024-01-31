package org.example.entities;

import jakarta.persistence.*;
import org.example.entities.Student;

@Entity
public class Student_Details {
    @Id @GeneratedValue
    private int id;
    @Column(name = "PINCODE")
    private int pincode;
    @OneToOne(mappedBy = "student_details",cascade = CascadeType.ALL)
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student s) {
        this.student = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
