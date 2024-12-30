package com.potatosoft.life.core.usecases;

import com.potatosoft.life.core.ports.user.CreateUserInputPort;
import com.potatosoft.life.core.ports.user.CreateUserRequestDto;
import com.potatosoft.life.core.ports.user.CreateUserResponseDto;
import org.springframework.stereotype.Component;

@Component
public class CreateUserUsecase implements CreateUserInputPort {
    @Override
    public CreateUserResponseDto createUser(CreateUserRequestDto command) {
        return new CreateUserResponseDto();
    }
}
