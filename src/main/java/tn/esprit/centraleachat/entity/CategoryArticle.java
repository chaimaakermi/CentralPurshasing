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

public class CategoryArticle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int idCat;
    String nomCat;


    @OneToMany(mappedBy = "categoryArticle")
    public Set<Article> articles;


}
