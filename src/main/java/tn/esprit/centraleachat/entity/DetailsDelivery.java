package tn.esprit.centraleachat.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DetailsDelivery implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int idDetailsD;
    Date dateDeliv;
    int idInvoice;
   String nameC;
}
