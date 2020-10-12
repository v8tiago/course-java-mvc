package com.tiagoarruda.course.repositories;

import com.tiagoarruda.course.entities.OrderItem;
import com.tiagoarruda.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
