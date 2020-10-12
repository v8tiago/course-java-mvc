package com.tiagoarruda.course.repositories;

import com.tiagoarruda.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
