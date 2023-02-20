package tn.esprit.centraleachat.service.Basket;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.Basket;
import tn.esprit.centraleachat.repository.BsketRepository;

import java.util.List;

@Service("Basket")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BasketService  implements IBasketService{
    @Autowired
    BsketRepository basketRepository;
    @Override
    public Basket addBasket(Basket basket) {
        return basketRepository.save(basket);
    }

    @Override
    public Basket UpdateBasket(Basket basket) {
        return basketRepository.save(basket);
    }

    @Override
    public void deleteBasket(int idBasket) {
        basketRepository.deleteById(idBasket);
    }

    @Override
    public List<Basket> findAllBasket() {

        return basketRepository.findAll();
    }

    @Override
    public Basket findByIdBasket(int idBasket) {

            return basketRepository.findById(idBasket).get();
    }
}
