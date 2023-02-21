package br.com.ciagatos.api.domain.cats.entities;

import br.com.ciagatos.api.domain.breeds.entities.Breed;
import br.com.ciagatos.api.domain.commons.entities.AbstractEntity;
import br.com.ciagatos.api.domain.enums.Gender;

import br.com.ciagatos.api.domain.users.entities.User;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "cats")
public class Cat extends AbstractEntity {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private User owner;
    @ManyToOne
    private Breed breed;
    private Gender gender;
    private Date birthDate;
}
