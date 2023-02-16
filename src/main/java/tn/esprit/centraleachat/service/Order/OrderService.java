package tn.esprit.centraleachat.service.Order;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.Order;
import tn.esprit.centraleachat.repository.OrderRepository;

import java.util.List;

@Service("order")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderService implements  IOrderService{
    @Autowired
    OrderRepository orderRepository;
    @Override
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order UpdateOrder(Integer idOrder, Order order) {
            List<Order> newOrder = orderRepository.findByIdOrder(idOrder);
            if (order.getNameArt()!= null )
                newOrder.get(0).setNameArt(order.getNameArt());
            return orderRepository.save(newOrder.get(0));
    }



    @Override
    public void deleteOrder(Integer idOrder) {
orderRepository.deleteById(idOrder);
    }

    @Override
    public List<Order> findAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> findByIdOrder(Integer idOrder) {
        return orderRepository.findByIdOrder(idOrder);
    }
}
