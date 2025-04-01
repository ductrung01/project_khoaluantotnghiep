package com.dan.shoe.perfume.dtos.requests;

import com.dan.shoe.perfume.models.enums.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductUpdatetion {
    private String name;
    private String description;
    private int price;
    private Long categoryId;
    private Long brandId;
    private Gender gender;
}
