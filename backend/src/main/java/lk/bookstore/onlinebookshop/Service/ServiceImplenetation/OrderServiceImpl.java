package lk.bookstore.onlinebookshop.Service.ServiceImplenetation;

import lk.bookstore.onlinebookshop.Entity.Order;
import lk.bookstore.onlinebookshop.Repository.OrderRepository;
import lk.bookstore.onlinebookshop.Service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(()->new NoSuchElementException("Order is not found"));
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Long id, Order order) {
        Order exOrder = getOrderById(id);
        exOrder.setItem(order.getItem());
        exOrder.setUnitPrice(order.getUnitPrice());
        exOrder.setQty(order.getQty());
        exOrder.setDiscount(order.getDiscount());
        exOrder.setTotal(order.getTotal());
        return exOrder;
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
