package br.com.ciagatos.api.domain.breeds.entities;

import br.com.ciagatos.api.domain.cats.entities.Cat;
import br.com.ciagatos.api.domain.commons.entities.AbstractEntity;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "breeds")
public class Breed extends AbstractEntity {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cat> catList;
    private String description;
}
