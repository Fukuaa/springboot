package com.example.demo.controller;

import com.example.demo.dao.dep;
import com.example.demo.dao.emp;
import com.example.demo.pojo.department;
import com.example.demo.pojo.employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class indexc {
    /*@RequestMapping("/index")
    public String index(){
        return "index";
    }*/
    @RequestMapping("/login")
    public String login(@RequestParam("a") String a,
                        @RequestParam("b") String b,
                        Model model, HttpSession session){
        /*System.out.println(a);
        System.out.println(b);*/
        if(a.equals("zqf")&&b.equals("123")){
            session.setAttribute("loginuser",a);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","用户名或密码错误");

            return "index";
        }

    }
    @Autowired
    com.example.demo.dao.emp emp;
    @RequestMapping("/emp")
    public String list(Model model){
        Collection<employ> employs = emp.getall();
        model.addAttribute("emps",employs);
        return "list";
    }
    @Autowired
    dep dep;
    @RequestMapping("/addemp")
    public String toaddemp(Model model){
        Collection<department> department = dep.gets();
        model.addAttribute("department",department);
        return "addlist";
    }
    @PostMapping("/addemp")
    public String addemp(employ employ){
        /*Collection<department> department = dep.gets();
        model.addAttribute("department",department);*/
        //return "redirect:/emp";
        //调用底层保存员工
        System.out.println(employ);
        emp.save(employ);
        return "list";
    }
    @GetMapping("/toupd/{id}")
    public String toupd(
            @PathVariable("id")Integer id,
            Model model){
        //System.out.println("toupd"+id);
        employ employ = emp.getbyid(id);
        //System.out.println(emp.getall());
        model.addAttribute("emp",employ);
        System.out.println(employ);
        Collection<department> departments = dep.gets();
        model.addAttribute("department",departments);
        System.out.println(departments);
        return "upd";
    }
    @PostMapping("/upd")
    public String upd(employ employ){
        emp.save(employ);
        return "list";
    }
    @RequestMapping("/d/{id}")
    public String delet(@PathVariable("id")Integer id){
        emp.delete(id);
        return "list";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:index.html";
    }
}
