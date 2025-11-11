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
        model.addAttribute("email", "analjyoti176@gmail.com");
        model.addAttribute("github", "https://github.com/ajiitkgp");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/anal-jyoti-2a5b211ba/");
        model.addAttribute("codeforces", "https://codeforces.com/profile/less_than_green");
        model.addAttribute("codechef", "https://www.codechef.com/users/ajsingh176");
        model.addAttribute("activePage", "home");
        
        return "index";
    }
    
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("activePage", "about");
        return "about";
    }
    
    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("activePage", "projects");
        return "projects";
    }
    
    @GetMapping("/experience")
    public String experience(Model model) {
        model.addAttribute("activePage", "experience");
        return "experience";
    }
    
    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("activePage", "contact");
        return "contact";
    }
}

