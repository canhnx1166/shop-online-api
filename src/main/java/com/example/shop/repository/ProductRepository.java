package com.example.shop.repository;

import com.example.shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByNameIgnoreCase(String name);
    List<Product> findByIsActiveTrue();
    List<Product> findByCategoryId(Long categoryId);
    @Query("SELECT p FROM Product p WHERE p.isActive = true AND p.category.id = :categoryId")
    List<Product> findActiveByCategoryId(@Param("categoryId") Long categoryId);
    @Query("SELECT p FROM Product p WHERE p.stock < p.inventory.reorderLevel")
    List<Product> findLowStockProducts();
}