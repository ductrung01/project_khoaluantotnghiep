package com.dan.shoe.perfume.dtos.requests;

import com.dan.shoe.perfume.models.enums.OrderType;
import com.dan.shoe.perfume.models.enums.PaymentType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderCreationByStaff {
    Long customerId;
    List<OrderProductCreation> orderProductCreations;
    String voucherCode = "";
    OrderType orderType;
    PaymentType paymentType;
    String address;
}
