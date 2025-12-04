package com.example.apartment_predictor;

public abstract class Person {

    //1. ATRIBUTES (FIELDS)
    private String id;
    private String name;
    private String email;
    private int age;

    //2. CONSTRUCTOR
    // 2.1 default constructor
    public Person() {}

    // 2.2 Constructor with all fields
    public Person(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    //3. Getters & setters

    public String getId() {
        return id;
    }

    /*public void setId(String id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 4. method toString
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
