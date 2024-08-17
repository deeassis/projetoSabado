package com.projeto.sabado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin-dashboard")
    public String adminDashboard(Model model) {
        return "admin-dashboard";
    }

    @GetMapping("/user-dashboard")
    public String userDashboard(Model model) {
        return "user-dashboard";
    }
}
