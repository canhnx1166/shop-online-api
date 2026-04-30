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
public class CouponResponse {

    private Long id;
    private String code;
    private Integer discountPercent;
    private Integer maxUses;
    private Integer usedCount;
    private LocalDateTime expiryDate;

    @JsonProperty("active")
    private Boolean isActive;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}