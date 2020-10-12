package com.tiagoarruda.course.repositories;

import com.tiagoarruda.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
