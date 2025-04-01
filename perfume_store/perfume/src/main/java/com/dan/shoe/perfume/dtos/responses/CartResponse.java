package com.dan.shoe.perfume.dtos.responses;

import com.dan.shoe.perfume.models.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartResponse {
    Long id;
    User user;
    Set<CartItemResponse> cartItemResponses = new HashSet<>();
    int totalPrice;
}
