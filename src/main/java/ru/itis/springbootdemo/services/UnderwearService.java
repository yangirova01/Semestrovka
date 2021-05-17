package ru.itis.springbootdemo.services;

import ru.itis.springbootdemo.dto.UnderwearPage;

public interface UnderwearService {
    UnderwearPage search(Integer size, Integer page, String query, String sort, String direction);
}
