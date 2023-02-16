package tn.esprit.centraleachat.service.Payment;

import tn.esprit.centraleachat.entity.Order;
import tn.esprit.centraleachat.entity.Payment;

import java.util.List;

public interface IPaymentService {
    public Payment addPayment (Payment payment);
    public Payment UpdatePayment(Payment payment) ;
    public void deletePayment(int idPaymentr) ;
    public List<Payment> findAllOrder() ;
    public Payment findByIdPayment(int idPayment)  ;
}
