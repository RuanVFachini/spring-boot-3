package br.com.ciagatos.api.application.users.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
public class UserCreateDto {
    @NotNull()
    @NotBlank()
    private String name;

    @NotNull()
    @NotBlank()
    private String email;

    @NotNull()
    @NotBlank()
    private String phone;

    @NotNull()
    private Date birthDate;
}
