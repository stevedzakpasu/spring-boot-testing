package com.stevedzakps.springboot.testing.service;

import com.stevedzakps.springboot.testing.model.Order;
import com.stevedzakps.springboot.testing.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
class OrderServiceImplTest {

    @Test
    void saveOrder() {
        OrderRepository mockRepository = Mockito.mock(OrderRepository.class);
        Order order = new Order();
        order.setProduct("Test Product");
        order.setQuantity(10);

        when(mockRepository.save(any(Order.class))).thenReturn(order);

        OrderService service = new OrderServiceImpl(mockRepository);
        service.saveOrder(order);

        verify(mockRepository, times(1)).save(order);
    }
}