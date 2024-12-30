package com.potatosoft.life.adapters.api;

import com.potatosoft.life.core.ports.user.*;
import com.potatosoft.life.core.services.UserServiceImpl;
import com.potatosoft.life.infra.utils.ControllerErrors;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> createUser(@Valid @RequestBody CreateUserRequestDto user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body(ControllerErrors.getErrors(bindingResult));
        }

        try {
            return ResponseEntity.ok(new CreateUserResponseDto());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Long id, @RequestBody UpdateUserRequestDto userDto) {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetUserResponseDto> getUser(@PathVariable Long id) {
        GetUserResponseDto responseDto = new GetUserResponseDto();
        return ResponseEntity.ok(responseDto);
    }
}
