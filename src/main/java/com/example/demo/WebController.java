package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
   @RequestMapping("/hello")
    public String sayHello(Model model) {
       System.out.println("Hello Spring Boot!");
       model.addAttribute("message", "Greetings from Jacob");
       return "hello";
    }
}
