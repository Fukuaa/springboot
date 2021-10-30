package com.example.demo.pojo;

import org.springframework.context.annotation.Bean;

public class employ {
    private Integer id;
    private String name;
    private Integer gender;
    private department department;

    @Override
    public String toString() {
        return "employ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", department=" + department +
                '}';
    }

    public employ() {
    }

    public employ(Integer id, String name, Integer gender, com.example.demo.pojo.department department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public com.example.demo.pojo.department getDepartment() {
        return department;
    }

    public void setDepartment(com.example.demo.pojo.department department) {
        this.department = department;
    }
}
