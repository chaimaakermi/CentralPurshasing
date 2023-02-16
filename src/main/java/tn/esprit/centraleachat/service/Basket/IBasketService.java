package tn.esprit.centraleachat.service.Basket;

import tn.esprit.centraleachat.entity.Basket;
import tn.esprit.centraleachat.entity.Supplier;

import java.util.List;

public interface IBasketService {
    public Basket addBasket (Basket basket);
    public Basket UpdateBasket(Basket basket) ;
    public void deleteBasket(int idBasket) ;
    public List<Basket> findAllBasket() ;
    public Basket findByIdBasket(int idBasket)  ;
}
