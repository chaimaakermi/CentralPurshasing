package tn.esprit.centraleachat.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idOrder ;
    String nameArt;
    Integer quantity;
    Float unitPrice;
    Float total;

    @Enumerated
    EtatOrder etatOrder;


    @OneToOne
    public OrderLine orderLine;
    @ManyToOne
    Consumer consumer;
    @OneToOne
    Supplier supplier;
    @OneToOne
    Operator operator;
    @OneToOne
    Invoice invoice;
}
