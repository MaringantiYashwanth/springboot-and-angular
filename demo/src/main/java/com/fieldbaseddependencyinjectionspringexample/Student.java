package com.fieldbaseddependencyinjectionspringexample;

import com.springexample.Grades;
import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    @Autowired
    public Grades grades;
}
