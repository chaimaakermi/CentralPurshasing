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

    public class Article implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int idArt;
        String nomArt;
        String description;
        String picture;
        Float prix;
        int stock;
        Date creationDate;
        String emplacement;

    @ManyToOne
    public CategoryArticle categoryArticle;
    @ManyToOne
    Basket basket;
}
