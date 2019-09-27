package com.qf.demo.controller;

import com.qf.demo.entity.Student;
import com.qf.demo.service.Stuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
/*
 *我是你爸爸
 */
@Controller
@RequestMapping("/stu")
public class Stucontroller {
    @Autowired
    private Stuservice stuservice;
    @RequestMapping("/list")
    public String list(Model model){
        List<Student>list=stuservice.list();
        model.addAttribute("list",list);
        return  "list";
    }
    @RequestMapping("del/{id}")
    public String del(@PathVariable("id") Integer id){
        stuservice.removeById(id);
        return "redirect:/stu/list";
    }
}
