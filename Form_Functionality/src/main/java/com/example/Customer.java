package com.example;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Customer {
    @Pattern(regexp = "^[a-z]+$", message = "Name can contains only a-z latters.")
//    @Min(value = 3, message = "Name is invalid.")
    @NotBlank(message = "Name field can not be empty.")
    private String name;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date;

    @Email(message = "Email is not correct.")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
