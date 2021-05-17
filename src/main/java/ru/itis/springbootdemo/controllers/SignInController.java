package ru.itis.springbootdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {

    @CrossOrigin("http://localhost")
    @GetMapping("/signIn")
    public String getSignInPage() {
        return "sign_in_page";
    }
}
