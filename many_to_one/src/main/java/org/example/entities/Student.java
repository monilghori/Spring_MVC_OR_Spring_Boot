package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id@GeneratedValue
    private int id;
    @Column(name = "STUDENT_NAME")
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "COLLAGE_FK")
    private Collages collage;
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

    public Collages getCollage() {
        return collage;
    }

    public void setCollage(Collages collage) {
        this.collage = collage;
    }
}
