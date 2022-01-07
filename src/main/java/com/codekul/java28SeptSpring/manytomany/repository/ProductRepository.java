package com.codekul.java28SeptSpring.manytomany.repository;

import com.codekul.java28SeptSpring.manytomany.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
