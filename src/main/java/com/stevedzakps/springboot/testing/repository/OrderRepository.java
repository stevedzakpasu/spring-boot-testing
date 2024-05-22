package com.stevedzakps.springboot.testing.repository;

import com.stevedzakps.springboot.testing.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
