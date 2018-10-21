package com.ek2.Controller;

import com.ek2.Entity.Student;
import com.ek2.Service.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by eK14u on 7/22/2018.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/")
    public String welcome(ModelMap model){
        model.put("content", "test");
        return "students";
    }

    @GetMapping("a")
    public String a(ModelMap model){
        model.put("content", "a");
        return "a";
    }

    @PostMapping("b")
    public void b(ModelMap model){
        model.put("content", "b");
    }

    @GetMapping("c")
    public String c(ModelMap model){
        model.put("content", "c");
        return "c";
    }

    @GetMapping("d")
    public void d(ModelMap model){
        model.put("content", "d");
    }

}