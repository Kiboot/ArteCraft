package com.hellohasan.sqlite_multiple_three_tables_crud.model;

public class Student {
    private int id;
    private String name;
    private String registrationNumber;
    private String phone;
    private String email;

    public Student(int id, String name, String registrationNumber, String phone, String email) {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.phone = phone;
        this.email = email;
    }
    public Student(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
