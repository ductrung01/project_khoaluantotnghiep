package com.dan.shoe.perfume.dtos.requests;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderProductCreation {
    Long productVariantId;
    int quantity;
    int price;
}
