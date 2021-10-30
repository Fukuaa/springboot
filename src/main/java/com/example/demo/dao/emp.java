package com.example.demo.dao;

import com.example.demo.pojo.department;
import com.example.demo.pojo.employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Component
public class emp {
    private static Map<Integer, employ> integerdepartmentMap = null;
    @Autowired
    private dep dep;
    static {
        integerdepartmentMap = new HashMap<Integer,employ>();
        integerdepartmentMap.put(111,new employ(111,"zqf",0,new department(101,"zqf")));
    }
    private static Integer integer = 111;
    //增加一个员工
    public void save(employ employ){
        System.out.println(employ);
        if (employ.getId()==null){
            employ.setId(integer++);
        }
        employ.setDepartment(dep.get(employ.getDepartment().getId()));
        integerdepartmentMap.put(employ.getId(),employ);
    }
    //查询全部员工信息
    public Collection<employ> getall(){
        return integerdepartmentMap.values();
    }
    /*public employ getall1(Integer id){
        System.out.println("employ"+id);
        return integerdepartmentMap.get(101);
    }*/
    //通过id查询员工
    public employ getbyid(Integer id){
        return integerdepartmentMap.get(id);
    }
    //删除
    public void delete(Integer id){
        integerdepartmentMap.remove(id);
    }
}
