package br.com.ciagatos.api.application.users.mappers;

import br.com.ciagatos.api.application.users.dtos.UserDto;
import br.com.ciagatos.api.domain.users.entities.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface IUserMapper {
    UserDto toDto(User user);
    List<UserDto> toDto(List<User> user);
}
