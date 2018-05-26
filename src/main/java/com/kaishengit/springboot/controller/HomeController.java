package com.kaishengit.springboot.controller;

import com.kaishengit.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello(Model model, HttpSession session) {
        model.addAttribute("message","Spring Boot");
        model.addAttribute("user", new User(1,"tianyu", "Spring boot"));
        session.setAttribute("msg", "session message");
        List<String> usernameList = new ArrayList<String>();
        usernameList.add("aa");
        usernameList.add("bb");
        usernameList.add("cc");
        usernameList.add("dd");


        return "hello";
    }
}
