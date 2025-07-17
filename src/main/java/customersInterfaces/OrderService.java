package customersInterfaces;

import java.util.List;

import com.s2p.FCT.entity.Order;

public interface OrderService {
	Order createOrder(Order order);
    Order getOrderById(Long id);
    List<Order> getOrdersByCustomerId(Long customerId);
}
