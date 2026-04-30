package com.example.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryResponse {

    private Long id;
    private Long productId;
    private String productName;
    private Integer quantity;
    private Integer reorderLevel;
    private LocalDateTime lastRestockDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}