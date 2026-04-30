package com.example.shop.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest {

    @NotNull(message = "Customer ID is required")
    private Long customerId;

    @Valid
    @NotEmpty(message = "Order items cannot be empty")
    private List<OrderItemRequest> orderItems;

    private String shippingAddress;
    private String paymentMethod;
}