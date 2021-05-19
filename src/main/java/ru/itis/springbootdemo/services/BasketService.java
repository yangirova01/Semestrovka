package ru.itis.springbootdemo.services;

import ru.itis.springbootdemo.dto.ProductDto;

import java.util.List;

public interface BasketService {
    List<ProductDto> getBasket();
    void addToBasket(Long productId);
}
