package com.mauroroncata.course.repositories;

import com.mauroroncata.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
