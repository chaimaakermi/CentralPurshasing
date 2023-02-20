package tn.esprit.centraleachat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centraleachat.entity.Payment;
import tn.esprit.centraleachat.service.Payment.IPaymentService;
import tn.esprit.centraleachat.service.Payment.PaymentService;

@RestController
@RequestMapping("/payment")

public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/addPayment")
    public void addPayment(@RequestBody Payment payment){
        paymentService.addPayment(payment);
    }

    @PutMapping("/updatePayment")
    public void updatePayment(@RequestBody Payment payment){
        paymentService.UpdatePayment(payment);
    }

    @DeleteMapping("/deletePayment/{idC}")
    public void deletePayment(@PathVariable int idPayment){
        paymentService.deletePayment(idPayment);
    }

    @GetMapping("/afficherPayment/{idC}")
    public void findByIdPayment(@PathVariable int idPayment){
        paymentService.findByIdPayment(idPayment);
    }
    @GetMapping("/findAllOrder")
    public void findAllOrder(){
        paymentService.findAllOrder();
    }

}
