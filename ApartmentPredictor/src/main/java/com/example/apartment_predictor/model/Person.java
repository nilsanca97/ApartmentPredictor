package com.example.apartment_predictor.model;

import com.example.apartment_predictor.utils.GenerateUUID;
import jakarta.persistence.Id;

public class Person {

    @Id
    private String id;
    private String name;
    private String surname;
    private String email;
    private String age;

    //empty Constructor
    public Person() {
        this.id = GenerateUUID.generateFourDigitUuid();
    }

    // constructor with all fields
    public Person(String name, String surname, String email, String age) {
        this.id = GenerateUUID.generateFourDigitUuid();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }

    // getters & setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
