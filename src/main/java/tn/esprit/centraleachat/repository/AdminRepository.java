package tn.esprit.centraleachat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.centraleachat.entity.Admin;
import tn.esprit.centraleachat.entity.Consumer;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

    public Admin findByEmailAndPassword(String email,String password);
}
