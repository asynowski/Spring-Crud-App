package com.example.SpringCrudApp.repository;

import com.example.SpringCrudApp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Integer> {
    Product findByName(String name);
}
