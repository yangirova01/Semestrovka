package ru.itis.springbootdemo.dto;

import lombok.Data;


@Data
public class UserForm {
    private String phoneNumber;
    private String email;
    private String password;
}

