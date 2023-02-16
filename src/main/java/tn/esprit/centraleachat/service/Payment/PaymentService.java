package tn.esprit.centraleachat.service.Payment;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.Payment;

import java.util.List;

@Service("Payment")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentService implements IPaymentService{
    @Override
    public Payment addPayment(Payment payment) {
        return null;
    }

    @Override
    public Payment UpdatePayment(Payment payment) {
        return null;
    }

    @Override
    public void deletePayment(int idPaymentr) {

    }

    @Override
    public List<Payment> findAllOrder() {
        return null;
    }

    @Override
    public Payment findByIdPayment(int idPayment) {
        return null;
    }
}
