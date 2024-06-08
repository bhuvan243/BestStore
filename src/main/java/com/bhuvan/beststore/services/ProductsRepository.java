package com.bhuvan.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhuvan.beststore.model.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
