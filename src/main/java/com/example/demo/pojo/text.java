package com.example.demo.pojo;

import com.example.demo.dao.dep;
import com.example.demo.dao.emp;

import org.springframework.beans.factory.annotation.Autowired;

public class text {
    @Autowired
    static
    emp emp;
    static com.example.demo.dao.dep dep;
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(dep.get(111));
        System.out.println(emp.getbyid(111));
        employ employ = emp.getbyid(111);
        System.out.println(employ);


    }
}
