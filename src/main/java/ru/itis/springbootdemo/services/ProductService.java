package ru.itis.springbootdemo.services;

import org.springframework.stereotype.Service;
import ru.itis.springbootdemo.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getProductBySizeAndPrice(String size, int price);
}
