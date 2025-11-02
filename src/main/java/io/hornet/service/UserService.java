package io.hornet.service;

import io.hornet.entity.UserEntity;
import io.hornet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserEntity create(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity get(UUID id) {
        return userRepository.findById(id).orElseThrow();
    }

    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    public UserEntity update(UUID id, UserEntity updated) {
        UserEntity existing = userRepository.findById(id).orElseThrow();
        existing.setFirstName(updated.getFirstName());
        existing.setLastName(updated.getLastName());
        existing.setEmail(updated.getEmail());
        return userRepository.save(existing);
    }

    public void delete(UUID id) {
        userRepository.deleteById(id);
    }
}
