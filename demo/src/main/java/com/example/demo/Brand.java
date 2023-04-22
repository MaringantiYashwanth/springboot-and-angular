package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Brand {
    private String name;
    private int year;
    public Brand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
