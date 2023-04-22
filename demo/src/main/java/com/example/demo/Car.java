package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Brand brand;
    public Car(Brand brand) {
        this.brand = brand;
    }
}