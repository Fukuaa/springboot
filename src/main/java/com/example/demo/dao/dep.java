package com.example.demo.dao;


import com.example.demo.pojo.department;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Component
public class dep {
    private static Map<Integer, department> integerdepartmentMap = null;

    static {
        integerdepartmentMap = new HashMap<Integer,department>();
        integerdepartmentMap.put(101,new department(111,"zqf"));
    }
    public Collection<department> gets(){
        //return department.values();
        return integerdepartmentMap.values();
    }
    public department get(Integer id){
        System.out.println("department"+id);
        return integerdepartmentMap.get(id);
    }
}
