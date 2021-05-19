package ru.itis.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.itis.springbootdemo.dto.ProductDto;
import ru.itis.springbootdemo.dto.ProductIdDto;
import ru.itis.springbootdemo.services.BasketService;

import java.util.List;

@Controller
@CrossOrigin(origins = "*")
public class BasketController {

    @Autowired
    private BasketService basketService;

    @GetMapping("/basket")
    public ResponseEntity<List<ProductDto>> getBasket() {
        return ResponseEntity.ok(basketService.getBasket());
    }

    @PostMapping("/basket/add")
    public void addToBasket(@RequestBody ProductIdDto productIdDto) {
        System.out.println("aaaa");
        basketService.addToBasket(productIdDto.getId());
    }
}
