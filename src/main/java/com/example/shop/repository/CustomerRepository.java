package com.example.shop.repository;

import com.example.shop.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmailIgnoreCase(String email);
    List<Customer> findByIsActiveTrue();
    @Query("SELECT c FROM Customer c WHERE c.isActive = true ORDER BY c.createdAt DESC")
    List<Customer> findAllActiveOrderByCreatedAtDesc();
}