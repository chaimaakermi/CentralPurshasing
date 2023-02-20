package tn.esprit.centraleachat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.centraleachat.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
