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
public class Operator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idOperator;
    String cinOp;
    String nameOp;
    String phoneOp;
    String emailOp;
    String adresseOp;
    String password;
    String confirm_password;

    @OneToOne (mappedBy = "operator")
    Order order;
}
