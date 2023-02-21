package br.com.ciagatos.api.application.users.controllers;

import br.com.ciagatos.api.application.users.dtos.UserCreateDto;
import br.com.ciagatos.api.application.users.dtos.UserDto;
import br.com.ciagatos.api.application.users.services.interfaces.IUserAppService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("users")
public class UserController {

    private final IUserAppService userAppService;

    public UserController(IUserAppService userAppService) {
        this.userAppService = userAppService;
    }

    @GetMapping()
    public List<UserDto> list() {
        return this.userAppService.list();
    }

    @PostMapping()
    public UserDto create(@RequestBody @Valid UserCreateDto userCreateDto) {
        return this.userAppService.create(userCreateDto);
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable long id) {
        return this.userAppService.getById(id);
    }
}
