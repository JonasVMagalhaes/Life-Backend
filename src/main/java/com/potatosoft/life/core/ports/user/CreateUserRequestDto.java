package com.potatosoft.life.core.ports.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequestDto {
    @NotNull(message = "O campo name é obrigatório")
    @Size(min= 2 , max = 50, message = "O nome deve ter entre 2 e 50 caracteres")
    private String firstname;

    @NotNull(message = "O campo lastname é obrigatório")
    @Size(min= 2 , max = 50, message = "O sobrenome deve ter entre 2 e 50 caracteres")
    private String lastname;

    @Email(message = "O campo email precisa ser válido")
    private String email;
}
