package ru.itis.springbootdemo.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.itis.springbootdemo.dto.LoginForm;
import ru.itis.springbootdemo.dto.TokenDto;
import ru.itis.springbootdemo.dto.UserForm;
import ru.itis.springbootdemo.models.Token;
import ru.itis.springbootdemo.models.User;
import ru.itis.springbootdemo.repositories.TokenRepository;
import ru.itis.springbootdemo.repositories.UsersRepository;

import java.util.Date;
import java.util.UUID;
import java.util.function.Supplier;

@Service
public class SignInServiceImpl implements SignInService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private TokenRepository tokensRepository;

    @SneakyThrows
    @Override
    public TokenDto login(LoginForm form) {
        User user = usersRepository.findFirstByEmail(form.getEmail())
                .orElseThrow((Supplier<Throwable>) () -> new UsernameNotFoundException("User not found"));
        if (passwordEncoder.matches(form.getPassword(), user.getHashPassword())) {
            String tokenValue = UUID.randomUUID().toString();
            Token token = Token.builder()
                    .token(tokenValue)
                    .user(user)
                    .build();

            tokensRepository.save(token);

            return TokenDto.builder()
                    .token(tokenValue)
                    .build();
        } else {
            throw new UsernameNotFoundException("Invalid username or password");
        }
    }
}
