package com.demo.mongodb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "marks")
public class Product {

    @Id
    private String id;

    private String product_name;

    private String product_price;

    private String product_material;

    private String product_color;

    private List<Integer> scores;

    private Boolean isPassed;
}
