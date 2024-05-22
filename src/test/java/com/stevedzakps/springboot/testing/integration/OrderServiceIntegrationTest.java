package com.stevedzakps.springboot.testing.integration;

import com.stevedzakps.springboot.testing.model.Order;
import com.stevedzakps.springboot.testing.repository.OrderRepository;
import com.stevedzakps.springboot.testing.service.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;
@DataJpaTest
public class OrderServiceIntegrationTest {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void testSaveOrder() {
        OrderServiceImpl service = new OrderServiceImpl(orderRepository);
        Order order = new Order();
        order.setProduct("Integration Test Product");
        order.setQuantity(5);

        service.saveOrder(order);

        assertThat(orderRepository.findById(order.getId())).isNotEmpty();
    }
}