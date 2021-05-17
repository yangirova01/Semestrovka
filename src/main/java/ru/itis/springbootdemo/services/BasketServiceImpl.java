package ru.itis.springbootdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import ru.itis.springbootdemo.dto.ProductDto;
import ru.itis.springbootdemo.dto.ProductDtoForRequst;
import ru.itis.springbootdemo.models.Product;
import ru.itis.springbootdemo.models.User;
import ru.itis.springbootdemo.repositories.ProductRepository;
import ru.itis.springbootdemo.repositories.UsersRepository;

import java.util.List;

public class BasketServiceImpl implements BasketService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> getBasket() {
        UserDetails details = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = details.getUsername();
        User user = usersRepository.findFirstByEmail(email);
        List<Product> productList = user.getProducts();
        return ProductDto.from(productList);
    }

    @Override
    public void addToBasket(Long productId) {
        UserDetails details = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = details.getUsername();
        User user = usersRepository.findFirstByEmail(email);
        Product product = productRepository.findById(productId).orElse(null);
        List<Product> productList = user.getProducts();
        productList.add(product);
        user.setProducts(productList);
        usersRepository.save(user);
    }
}
