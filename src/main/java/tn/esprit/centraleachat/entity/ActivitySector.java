package tn.esprit.centraleachat.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ActivitySector implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idSector;
    String codeSector;
    String description;

    @ManyToMany(mappedBy = "activitySector")
    public Set<Supplier> Suppliers ;
}
