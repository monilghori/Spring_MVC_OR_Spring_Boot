package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id@GeneratedValue
    int pid;
    @Column(name = "Person_name")
    String name;
    @OneToOne(cascade = CascadeType.ALL)
    Aadhar aadhar;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Aadhar getAadhar() {
        return aadhar;
    }

    public void setAadhar(Aadhar aadhar) {
        this.aadhar = aadhar;
    }
}
