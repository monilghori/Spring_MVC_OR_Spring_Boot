package com.example;

import java.util.Date;

public class Patient {

    private String patientName;
    private Long patientContact;
    private Date date;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Long getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(Long patientContact) {
        this.patientContact = patientContact;
    }
}
