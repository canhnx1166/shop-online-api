package com.example.shop.config;


import com.example.shop.entity.Category;
import com.example.shop.entity.Product;
import com.example.shop.repository.CategoryRepository;
import com.example.shop.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private final CategoryRepository categoryRepo;
    private final ProductRepository productRepo;

    public DataSeeder(CategoryRepository categoryRepo, ProductRepository productRepo) {
        this.categoryRepo = categoryRepo;
        this.productRepo = productRepo;
    }

    @Override
    public void run(String... args) {

        Category laptop = categoryRepo.findById(2L).orElseThrow();

        Product p1 = new Product();
        p1.setName("Macbook Pro");
        p1.setPrice(BigDecimal.valueOf(3000));
        p1.setStock(5);
        p1.setCategory(laptop);

        Product p2 = new Product();
        p2.setName("Dell XPS 13");
        p2.setPrice(BigDecimal.valueOf(2500));
        p2.setStock(7);
        p2.setCategory(laptop);

        productRepo.saveAll(List.of(p1, p2));
    }

}