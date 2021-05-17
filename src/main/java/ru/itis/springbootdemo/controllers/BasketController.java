package ru.itis.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.itis.springbootdemo.dto.ProductDto;
import ru.itis.springbootdemo.dto.ProductDtoForRequst;
import ru.itis.springbootdemo.services.BasketService;

import java.util.List;

public class BasketController {

    @Autowired
    private BasketService basketService;

    @CrossOrigin("http://localhost")
    @GetMapping("/basket")
    public ResponseEntity<List<ProductDto>> getBasket() {
        return ResponseEntity.ok(basketService.getBasket());
    }

    @CrossOrigin("http://localhost")
    @GetMapping("/basket")
    public void addToBasket(@RequestParam Long productId) {
        basketService.addToBasket(productId);
    }
}
