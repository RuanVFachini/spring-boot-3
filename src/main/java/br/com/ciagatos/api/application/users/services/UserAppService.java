package br.com.ciagatos.api.application.users.services;

import br.com.ciagatos.api.application.users.dtos.UserCreateDto;
import br.com.ciagatos.api.application.users.dtos.UserDto;
import br.com.ciagatos.api.application.users.mappers.IUserMapper;
import br.com.ciagatos.api.application.users.services.interfaces.IUserAppService;
import br.com.ciagatos.api.domain.users.entities.User;
import br.com.ciagatos.api.domain.users.repositories.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserAppService implements IUserAppService {

    private final IUserRepository userRepository;
    private final IUserMapper userMapper;

    public UserAppService(
            IUserRepository userRepository,
            IUserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDto> list() {
        List<User> userList = this.userRepository.findAll();
        return this.userMapper.toDto(userList);
    }

    @Override
    public UserDto create(UserCreateDto userCreateDto) {
        return null;
    }

    @Override
    public UserDto getById(long userId) {
        User user = this.userRepository.getReferenceById(userId);

        return this.userMapper.toDto(user);
    }
}
