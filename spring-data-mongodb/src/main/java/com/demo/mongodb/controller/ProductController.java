package com.demo.mongodb.controller;

import com.demo.mongodb.dto.Product;
import com.demo.mongodb.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private ProductRepository repository;

    /* TODO
        Use Service to call repository from controller
        Use Response Entity to show response not a static message like here
    */

    @PostMapping("/addProduct")
    public String saveProduct(@RequestBody Product product){
        repository.save(product);
        return "Product added successfully";
    }

    @PostMapping("/addProductList")
    public String saveProductList(@RequestBody List<Product> productList){
        repository.saveAll(productList);
        return "Product List added successfully";
    }

    @GetMapping("/getProductList")
    public List<Product> getProductList(){
      return repository.findAll();
    }

    //TODO Write an update API

    @DeleteMapping("/deleteById/{id}")
    public String deleteProduct(@PathVariable String id){
        repository.deleteById(id);
        return "Product deleted successfully";
    }
}
