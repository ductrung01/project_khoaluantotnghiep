package com.dan.shoe.perfume.dtos.responses;

import com.dan.shoe.perfume.models.Brand;
import com.dan.shoe.perfume.models.Category;
import com.dan.shoe.perfume.models.ProductVariant;
import com.dan.shoe.perfume.models.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponse {
    Long id;
    String name;
    String description;
    int price;
    Brand brand;
    Category category;
    boolean status;
    Gender gender;
    List<ProductVariant> productVariants;
    int totalStock;
}
