package com.dan.shoe.perfume.dtos.responses;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartItemResponse {
    Long id;
    ProductVariantDetailsResponse productVariantDetailsResponse;
    int quantity;
    int price;
}
