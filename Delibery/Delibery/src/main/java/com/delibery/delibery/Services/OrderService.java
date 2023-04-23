package com.delibery.delibery.Services;

import com.delibery.delibery.Clases.Order;
import com.delibery.delibery.Repository.OrderRepository;

import java.util.List;
import java.util.Optional;

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
            this.orderRepository = orderRepository;
        }

        public void createOrder(Order order) {
            orderRepository.save(order);
        }

        public List<Order> getAllOrders() {
            return orderRepository.findAll();
        }

        public Optional<Order> getOrderById(Long id) {
            return orderRepository.findById(id);
        }

        public void updateOrder(Order order) {
            orderRepository.save(order);
        }

        public void deleteOrder(Order order) {
            orderRepository.delete(order);
        }


}
