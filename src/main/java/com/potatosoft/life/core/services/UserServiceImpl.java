package com.potatosoft.life.core.services;

import com.potatosoft.life.adapters.persistence.UserRepository;
import com.potatosoft.life.core.domain.User;
import com.potatosoft.life.core.ports.user.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements CreateUserInputPort, UpdateUserInputPort, DeleteUserInputPort, GetUserOutputPort {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public CreateUserResponseDto createUser(CreateUserRequestDto command) {
        User user = new User();
        userRepository.save(user);

        return new CreateUserResponseDto();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
    }

    @Override
    public void updateUser(UpdateUserRequestDto command) {
        User user = new User();
        userRepository.save(user);
    }
}
