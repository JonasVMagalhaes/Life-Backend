package com.potatosoft.life.core.ports.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequestDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
}
