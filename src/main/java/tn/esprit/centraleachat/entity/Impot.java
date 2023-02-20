package tn.esprit.centraleachat.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Impot implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idImpot;
    String nameImpot;
    float taux;

    @Transient
    @OneToOne(mappedBy = "impot" )
    Invoice invoice;
}
