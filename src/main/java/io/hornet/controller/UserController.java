package io.hornet.controller;

import io.hornet.entity.UserEntity;
import io.hornet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserEntity create(@RequestBody UserEntity user) {
        return userService.create(user);
    }

    @GetMapping("/{id}")
    public UserEntity get(@PathVariable UUID id) {
        return userService.get(id);
    }

    @GetMapping
    public List<UserEntity> getAll() {
        return userService.getAll();
    }

    @PutMapping("/{id}")
    public UserEntity update(@PathVariable UUID id, @RequestBody UserEntity updated) {
        return userService.update(id, updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        userService.delete(id);
    }
}
