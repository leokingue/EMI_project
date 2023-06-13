package com.emi.ecommerce.dao;

import com.emi.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
