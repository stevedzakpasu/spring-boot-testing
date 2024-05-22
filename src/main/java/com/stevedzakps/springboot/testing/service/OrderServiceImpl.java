package com.stevedzakps.springboot.testing.service;

import com.stevedzakps.springboot.testing.model.Order;
import com.stevedzakps.springboot.testing.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public boolean saveOrder(Order order) {
        orderRepository.save(order);
        return true;
    }


}