package tn.esprit.centraleachat.service.OrderLine;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.OrderLine;
import tn.esprit.centraleachat.repository.OrderLineRepository;

import java.util.List;

@Service("OrederLine")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderLineService implements IOrderLineService{

    @Autowired
    OrderLineRepository orderLineRepository;

    @Override
    public OrderLine addOrder(OrderLine orderLine) {
        return  orderLineRepository.save(orderLine);
    }

    @Override
    public OrderLine UpdateOrderLine(OrderLine orderLine) {
        return orderLineRepository.save(orderLine);

    }

    @Override
    public void deleteOrderLine(int idOrderLine) {
        orderLineRepository.deleteById(idOrderLine);
    }

    @Override
    public List<OrderLine> findAllOrderLine() {

        return orderLineRepository.findAll();
    }

    @Override
    public OrderLine findByIdOrderLine(int idOrderLine) {

        return orderLineRepository.findById(idOrderLine).get();
    }
}
