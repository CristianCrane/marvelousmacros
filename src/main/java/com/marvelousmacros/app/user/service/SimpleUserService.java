package com.marvelousmacros.app.user.service;

import com.marvelousmacros.app.user.error.UserNotFoundException;
import com.marvelousmacros.app.user.repository.User;
import com.marvelousmacros.app.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SimpleUserService implements UserService {
    private final UserRepository userRepository;

    public SimpleUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        // todo: what happens when you save without an ID?
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isEmpty()) {
            throw new UserNotFoundException(userId);
        }
        return user.get();
    }

    @Override
    public User updateUser(User updatedUser) {
        // todo: this will overwrite everything, implement proper put method handler
        return userRepository.save(updatedUser);
    }

    @Override
    public void deleteUser(String userId) {
        User user = getUser(userId);
        userRepository.deleteById(user.getId());
    }
}
