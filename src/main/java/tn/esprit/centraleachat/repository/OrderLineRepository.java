package tn.esprit.centraleachat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.centraleachat.entity.OrderLine;

import java.util.List;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLine,Integer> {
    List<OrderLine> findByIdRating(Integer idRating);
}
