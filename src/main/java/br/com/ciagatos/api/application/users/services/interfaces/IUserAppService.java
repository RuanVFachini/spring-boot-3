package br.com.ciagatos.api.application.users.services.interfaces;

import br.com.ciagatos.api.application.users.dtos.UserCreateDto;
import br.com.ciagatos.api.application.users.dtos.UserDto;

import java.util.List;

public interface IUserAppService {

    public List<UserDto> list();

    UserDto create(UserCreateDto userCreateDto);

    UserDto getById(long userId);
}
