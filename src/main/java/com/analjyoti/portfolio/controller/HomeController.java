package com.analjyoti.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Anal Jyoti");
        model.addAttribute("title", "Software Development Engineer");
        model.addAttribute("email", "analjyoti176@gmail.com"); // Update this
        model.addAttribute("github", "https://github.com/ajiitkgp");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/anal-jyoti-2a5b211ba/");
        model.addAttribute("codeforces", "https://codeforces.com/profile/less_than_green");
        model.addAttribute("codechef", "https://www.codechef.com/users/ajsingh176");
        
        return "index";
    }
    
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    
    @GetMapping("/projects")
    public String projects() {
        return "projects";
    }
    
    @GetMapping("/experience")
    public String experience() {
        return "experience";
    }
    
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}

