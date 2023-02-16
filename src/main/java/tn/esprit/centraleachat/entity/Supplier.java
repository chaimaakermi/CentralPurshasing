package tn.esprit.centraleachat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Supplier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idSup;
    String cinSup;
    String nameSup;
    String phoneSup;
    String emailSup;
    String adressSup;
    String password;
    String confirm_password;
    @ManyToMany
    @JsonIgnore
    public Set<ActivitySector> activitySector= new HashSet<>();

    @OneToMany(mappedBy = "supplier")
    @JsonIgnore
    public Set<Invoice> Invoices;

    @OneToOne(mappedBy = "supplier")
    Order order;
}
