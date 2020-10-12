package com.tiagoarruda.course.repositories;

import com.tiagoarruda.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
