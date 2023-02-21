package br.com.ciagatos.api.domain.users.entities;

import br.com.ciagatos.api.domain.cats.entities.Cat;
import br.com.ciagatos.api.domain.commons.entities.AbstractEntity;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends AbstractEntity {
    @Id
    @GeneratedValue
    private long id;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cat> catList;
    private String name;
    private String email;
    private String phone;
    private Date birthDate;
}
