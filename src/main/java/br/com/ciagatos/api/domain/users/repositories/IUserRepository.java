package br.com.ciagatos.api.domain.users.repositories;

import br.com.ciagatos.api.domain.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
