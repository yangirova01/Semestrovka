package ru.itis.springbootdemo.services;

public interface MailService {
    void sendEmailForConfirm(String email, String code);
}
