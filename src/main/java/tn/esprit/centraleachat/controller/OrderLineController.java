package tn.esprit.centraleachat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centraleachat.entity.OrderLine;
import tn.esprit.centraleachat.service.OrderLine.OrderLineService;

import java.util.List;

@RestController
@RequestMapping("/orderLine")

public class OrderLineController {

    @Autowired
    OrderLineService orderLineService;

    @GetMapping("/afficherAllOrderLine")
    public List<OrderLine> findAllOrderLine(){
        return orderLineService.findAllOrderLine();
    }

    @GetMapping("/afficherOrderLine/{idC}")
    public OrderLine findByIdOrderLine(@PathVariable int idOrderLine){
        return orderLineService.findByIdOrderLine(idOrderLine);
    }

    @GetMapping("/addOrderLine")
    public OrderLine addOrder(OrderLine orderLine){
        return orderLineService.addOrder(orderLine);
    }

    @PutMapping("/updateOrderLine")
    public OrderLine updateOrderLine(OrderLine orderLine){
        return orderLineService.UpdateOrderLine(orderLine);
    }

}
