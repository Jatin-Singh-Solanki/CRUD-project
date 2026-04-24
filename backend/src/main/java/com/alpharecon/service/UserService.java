package com.alpharecon.service;

import com.alpharecon.dto.UserDto;
import com.alpharecon.entity.User;
import com.alpharecon.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    public User createUser(UserDto userDto) {
        if (userRepository.existsByEmail(userDto.getEmail())) {
            throw new RuntimeException("A user with this email already exists");
        }

        User user = new User();
        user.setFirstName(userDto.getFirstName().trim());
        user.setLastName(userDto.getLastName().trim());
        user.setEmail(userDto.getEmail().trim().toLowerCase());
        user.setNote(userDto.getNote());

        return userRepository.save(user);
    }

    public User updateUser(Long id, UserDto userDto) {
        User existingUser = getUserById(id);

        String newEmail = userDto.getEmail().trim().toLowerCase();

        if (!existingUser.getEmail().equalsIgnoreCase(newEmail)
                && userRepository.existsByEmail(newEmail)) {
            throw new RuntimeException("A user with this email already exists");
        }

        existingUser.setFirstName(userDto.getFirstName().trim());
        existingUser.setLastName(userDto.getLastName().trim());
        existingUser.setEmail(newEmail);
        existingUser.setNote(userDto.getNote());

        return userRepository.save(existingUser);
    }

    public void deleteUser(Long id) {
        User existingUser = getUserById(id);
        userRepository.delete(existingUser);
    }
}