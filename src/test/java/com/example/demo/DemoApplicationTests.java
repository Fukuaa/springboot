package com.example.demo;

import com.example.demo.dao.dep;
import com.example.demo.dao.emp;
import com.example.demo.pojo.department;
import com.example.demo.pojo.employ;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    dep dep;
    com.example.demo.dao.emp emp;
    @Test
    void contextLoads() {
        System.out.println(1);
        department dep1= dep.get(111);
        System.out.println(dep1);
        System.out.println(emp.getbyid(111));
        employ employ = emp.getbyid(111);
        System.out.println(employ);
        System.out.println(1);
    }

}
