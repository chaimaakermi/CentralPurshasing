package tn.esprit.centraleachat.service.Basket;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.Basket;

import java.util.List;

@Service("Basket")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BasketService  implements IBasketService{
    @Override
    public Basket addBasket(Basket basket) {
        return null;
    }

    @Override
    public Basket UpdateBasket(Basket basket) {
        return null;
    }

    @Override
    public void deleteBasket(int idBasket) {

    }

    @Override
    public List<Basket> findAllBasket() {
        return null;
    }

    @Override
    public Basket findByIdBasket(int idBasket) {
        return null;
    }
}
