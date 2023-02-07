package com.eblj.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eblj.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
}
