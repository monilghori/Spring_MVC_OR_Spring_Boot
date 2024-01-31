package org.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Collages {
    @Id@GeneratedValue
    private int id;
    @Column(name = "COLLAGE_NAME")
    private String name;
    @OneToMany(mappedBy = "collage",cascade = CascadeType.ALL)
    private List<Student> student;
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

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
