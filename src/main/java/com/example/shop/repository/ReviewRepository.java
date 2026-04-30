package com.example.shop.repository;

import com.example.shop.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByProductId(Long productId);
    List<Review> findByCustomerId(Long customerId);
    @Query("SELECT r FROM Review r WHERE r.product.id = :productId AND r.isActive = true")
    List<Review> findActiveReviewsByProductId(Long productId);
}