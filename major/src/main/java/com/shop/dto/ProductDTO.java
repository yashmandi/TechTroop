package com.shop.dto;

import com.shop.model.Category;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private Category categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
