package com.potatosoft.life.core.ports.user;

public interface CreateUserInputPort {
    CreateUserResponseDto createUser(CreateUserRequestDto command);
}
