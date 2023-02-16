package tn.esprit.centraleachat.service.OrderLine;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.OrderLine;

import java.util.List;

@Service("OrederLine")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderLineService implements IOrderLineService{
    @Override
    public OrderLine addOrder(OrderLine orderLine) {
        return null;
    }

    @Override
    public OrderLine UpdateOrderLine(OrderLine orderLine) {
        return null;
    }

    @Override
    public void deleteOrderLine(int idOrderLine) {

    }

    @Override
    public List<OrderLine> findAllOrderLine() {
        return null;
    }

    @Override
    public OrderLine findByIdOrderLine(int idOrderLine) {
        return null;
    }
}
