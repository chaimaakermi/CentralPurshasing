package tn.esprit.centraleachat.service.Payment;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.Payment;
import tn.esprit.centraleachat.repository.PaymentRepository;

import java.util.List;

@Service("Payment")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentService implements IPaymentService{
    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public Payment addPayment(Payment payment) {

        return paymentRepository.save(payment);

    }

    @Override
    public Payment UpdatePayment(Payment payment) {

        return paymentRepository.save(payment);
    }

    @Override
    public void deletePayment(int idPaymentr) {
        paymentRepository.deleteById(idPaymentr);

    }

    @Override
    public List<Payment> findAllOrder() {

        return paymentRepository.findAll();
    }

    @Override
    public Payment findByIdPayment(int idPayment) {

        return paymentRepository.findById(idPayment).get();
    }
}
