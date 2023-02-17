package tn.esprit.centraleachat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.centraleachat.entity.Basket;

import java.util.List;

@Repository
public interface BsketRepository extends JpaRepository<Basket,Integer> {
    List<Basket> findByIdBasket(Integer idBasket);
}
