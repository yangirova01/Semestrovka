package ru.itis.springbootdemo.services;

import ru.itis.springbootdemo.dto.LoginForm;
import ru.itis.springbootdemo.dto.TokenDto;
import ru.itis.springbootdemo.dto.UserForm;

public interface SignInService {
    TokenDto login(LoginForm form);
}
