package tn.esprit.centraleachat.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centraleachat.entity.Order;
import tn.esprit.centraleachat.entity.Supplier;
import tn.esprit.centraleachat.service.Order.IOrderService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("order")
public class OrderController {

    IOrderService orderService;

    @PostMapping("/ajouterOrder")
        public Order ajouterOrder (@RequestBody Order order){
        return orderService.addOrder(order);

    }

    @PutMapping("/modifierOrder/{id}")
    public Order UpdateOrder (@PathVariable Integer idOrder, @RequestBody Order order){

        return orderService.UpdateOrder(idOrder, order);
    }

    @DeleteMapping("/supprimerOrder")
    public void deleteOrder (@PathVariable Integer idOrder){
        orderService.deleteOrder(idOrder);

    }

    @GetMapping("/afficherAllOrder")
    public List<Order> findAllOrder(){

        return orderService.findAllOrder() ;
    }

    @GetMapping("/afficherOrder/{id}")

    public List<Order> findByIdOrder(@PathVariable("id") Integer idOrder) {
        return orderService.findByIdOrder(idOrder)  ;

    }


}
