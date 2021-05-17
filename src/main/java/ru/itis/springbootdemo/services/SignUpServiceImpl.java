package ru.itis.springbootdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.itis.springbootdemo.dto.UserForm;
import ru.itis.springbootdemo.models.User;
import ru.itis.springbootdemo.repositories.UsersRepository;

import java.util.UUID;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MailService mailService;
    @Autowired
    private SmsService smsService;

    @Override
    public void signUp(UserForm form) {
        User newUser = User.builder()
                .email(form.getEmail())
                .phoneNumber(form.getPhoneNumber())
                .password(passwordEncoder.encode(form.getPassword()))
                .build();

        usersRepository.save(newUser);
        smsService.sendSms(form.getPhoneNumber(), "Вы зарегистрированы!");
        mailService.sendEmailForConfirm(form.getEmail(), UUID.randomUUID().toString());
    }
}