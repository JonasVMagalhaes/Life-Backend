package com.potatosoft.life.adapters.api;

import com.potatosoft.life.core.domain.User;
import com.potatosoft.life.core.ports.user.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserInputPort createUserInputPort;
    private final DeleteUserInputPort deleteUserInputPort;
    private final GetUserOutputPort getUserOutputPort;
    private final UpdateUserInputPort updateUserInputPort;

    public UserController(CreateUserInputPort createUserInputPort, DeleteUserInputPort deleteUserInputPort, GetUserOutputPort getUserOutputPort, UpdateUserInputPort updateUserInputPort) {
        this.createUserInputPort = createUserInputPort;
        this.deleteUserInputPort = deleteUserInputPort;
        this.getUserOutputPort = getUserOutputPort;
        this.updateUserInputPort = updateUserInputPort;
    }

//    @PostMapping
//    public ResponseEntity<Void> createUser(@RequestBody CreaterUserRequestDto userDto) {
//        createUserInputPort.createUser(userDto);
//        return ResponseEntity.created(null).build();
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Void> updateUser(@PathVariable Long id, @RequestBody UpdateUserRequestDto userDto) {
//        updateUserInputPort.updateUser(userDto);
//        return ResponseEntity.noContent().build();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
//        deleteUserInputPort.deleteUser(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<GetUserResponseDto> getUser(@PathVariable Long id) {
//        User user = getUserOutputPort.getUser(id);
//        GetUserResponseDto responseDto = new GetUserResponseDto();
//        return  ResponseEntity.ok(responseDto);
//    }
}
