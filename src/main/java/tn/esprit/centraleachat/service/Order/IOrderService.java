package tn.esprit.centraleachat.service.Order;

import tn.esprit.centraleachat.entity.Basket;
import tn.esprit.centraleachat.entity.Order;

import java.util.List;

public interface IOrderService {
    public Order addOrder (Order order);
    public Order UpdateOrder(Integer idOrder  ,Order order) ;


    void deleteOrder(Integer idOrder);

    public List<Order> findAllOrder() ;
    public List<Order> findByIdOrder(Integer idOrder)  ;
}
