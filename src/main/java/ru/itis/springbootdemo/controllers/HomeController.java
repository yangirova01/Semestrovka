package ru.itis.springbootdemo.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.springbootdemo.security.details.UserDetailsImpl;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
