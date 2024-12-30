package com.potatosoft.life.core.ports.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserResponseDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
}
