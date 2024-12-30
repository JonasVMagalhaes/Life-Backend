package com.potatosoft.life.core.ports.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreaterUserRequestDto {
    private String firstname;
    private String lastname;
    private String email;
}
