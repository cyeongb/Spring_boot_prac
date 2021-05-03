package com.example.demo.student;

import java.lang.reflect.Constructor;
import java.time.LocalDate;

public class Student {
    private long id;
    private String name;
    private int age;
    private LocalDate birthDate;
    private  String email;

    //alt + insert > constructor
    //method _with ID
    public Student(long id, String name, int age, LocalDate birthDate, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.email = email;
    }

    // method _without ID
    public Student(String name, int age, LocalDate birthDate, String email) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.email = email;
    }
}
