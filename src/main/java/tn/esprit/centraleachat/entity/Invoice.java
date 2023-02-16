package tn.esprit.centraleachat.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

    public class Invoice  implements Serializable  {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int idInvoice;
        int idConsumer;
        String nameArt;
        Date dateCreationInvoice;
        float unitPrice;
        float totalPrice;

        @Enumerated
        TypeInvoice typeInvoice;
    @ManyToOne()
    public Supplier supplier;
    @OneToOne (mappedBy = "invoice")
    Order order;
    @ManyToOne
    Payment payment;
}
