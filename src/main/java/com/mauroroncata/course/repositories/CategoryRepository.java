package com.mauroroncata.course.repositories;

import com.mauroroncata.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
