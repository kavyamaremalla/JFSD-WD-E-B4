package com.advanced;

import java.util.ArrayList;
import java.util.List;

public class ProductStreamExample {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        Product product = new Product(1, "Laptop", 26897f);

        Product product1 = new Product();
        product1.setId(2);
        product1.setName("TV");
        product1.setPrice(56890f);

        productList.add(product);
        productList.add(product1);
        productList.add(new Product(3, "Fridge", 34567f));

//        System.out.println(productList);

        List<Float> priceList = productList.stream()
                .map(p -> p.getPrice())
                .filter(price -> price > 30000f).toList();

        List<Integer> idList = productList.stream()
                .filter(price -> price.getPrice() > 30000f).map(p -> p.getId()).toList();

//                new ArrayList<>();
//
//
//        for (Product prod : productList){
//            if (prod.getPrice() < 40000f){
//                priceList.add(prod.getPrice());
//            }
//        }
//
        System.out.println(priceList);
        System.out.println(idList);
    }
}
