package com.example.shop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewResponse {

    private Long id;
    private Long productId;
    private String productName;
    private Long customerId;
    private String customerName;
    private Integer rating;
    private String comment;

    @JsonProperty("active")
    private Boolean isActive;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}