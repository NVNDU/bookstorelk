package lk.bookstore.onlinebookshop.Service;

import lk.bookstore.onlinebookshop.Entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order saveOrder(Order order);
    Order updateOrder(Long id, Order order);
    void deleteOrder(Long id);
}
