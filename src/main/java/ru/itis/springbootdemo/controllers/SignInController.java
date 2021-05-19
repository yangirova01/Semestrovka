package ru.itis.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.itis.springbootdemo.dto.LoginForm;
import ru.itis.springbootdemo.dto.TokenDto;
import ru.itis.springbootdemo.dto.UserForm;
import ru.itis.springbootdemo.services.SignInService;

@RestController
public class SignInController {

    @Autowired
    private SignInService signInService;

    @PostMapping("/login")
    public ResponseEntity<TokenDto> login(@RequestBody LoginForm form) {
        return ResponseEntity.ok(signInService.login(form));
    }
}
