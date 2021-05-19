package ru.itis.springbootdemo.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import ru.itis.springbootdemo.dto.ProductDto;
import ru.itis.springbootdemo.models.Product;
import ru.itis.springbootdemo.models.User;
import ru.itis.springbootdemo.repositories.ProductRepository;
import ru.itis.springbootdemo.repositories.UsersRepository;

import java.util.List;
import java.util.function.Supplier;

@Component
public class BasketServiceImpl implements BasketService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> getBasket() {
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getCredentials());
        User user = usersRepository.findFirstByEmail(email);
        List<Product> productList = user.getProducts();
        return ProductDto.from(productList);

        return null;
    }

    @SneakyThrows
    @Override
    public void addToBasket(Long productId) {
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getCredentials());
        String email = details.getUsername();
        User user = usersRepository.findFirstByEmail(email).orElseThrow((Supplier<Throwable>) () -> new IllegalStateException("AA"));
        Product product = productRepository.findById(productId).orElse(null);
        List<Product> productList = user.getProducts();
        productList.add(product);
        user.setProducts(productList);
        usersRepository.save(user);
    }
}
