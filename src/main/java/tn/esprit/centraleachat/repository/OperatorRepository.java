package tn.esprit.centraleachat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.centraleachat.entity.Operator;

public interface OperatorRepository extends JpaRepository<Operator,Integer> {
}
