package tn.esprit.centraleachat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centraleachat.entity.Basket;
import tn.esprit.centraleachat.service.Basket.BasketService;

import java.util.List;

@RestController
@RequestMapping("/basket")
public class BasketController {

    @Autowired
    BasketService basketService;


    @PostMapping("/addBasket")
    public Basket addBasket(@RequestBody Basket basket){
        return basketService.addBasket(basket);
    }

    @PutMapping("/updateBasket")
    public Basket updateBasket(@RequestBody Basket basket){
        return basketService.UpdateBasket(basket);
    }

    @DeleteMapping("/deleteBasket/{idBasket}")
    public void deleteBasket(@PathVariable int idBasket){
        basketService.deleteBasket(idBasket);
    }

    @GetMapping("/getAllBasket")
    public List<Basket> getAllBasket(){
        return basketService.findAllBasket();
    }

}
