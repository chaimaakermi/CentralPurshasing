package tn.esprit.centraleachat.service.OrderLine;

import tn.esprit.centraleachat.entity.Basket;
import tn.esprit.centraleachat.entity.Order;
import tn.esprit.centraleachat.entity.OrderLine;

import java.util.List;

public interface IOrderLineService {
    public OrderLine addOrder (OrderLine orderLine);
    public OrderLine UpdateOrderLine(OrderLine orderLine) ;
    public void deleteOrderLine(int idOrderLine) ;
    public List<OrderLine> findAllOrderLine() ;
    public OrderLine findByIdOrderLine(int idOrderLine) ;
}
