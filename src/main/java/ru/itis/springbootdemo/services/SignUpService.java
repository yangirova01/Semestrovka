package ru.itis.springbootdemo.services;

import org.springframework.stereotype.Service;
import ru.itis.springbootdemo.dto.UserForm;


public interface SignUpService {
    void signUp(UserForm form);
}

