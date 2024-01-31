package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class BtechStudent implements Student{
    @Override
    public String getStatus() {
        return this + "is studying in BTech.";
    }
}
