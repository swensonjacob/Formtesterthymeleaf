package com.example.formtesterthymeleaf;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String occupation;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
