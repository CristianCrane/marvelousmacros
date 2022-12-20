package com.marvelousmacros.app.user.service;

import com.marvelousmacros.app.user.repository.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User getUser(String userId);
    User updateUser(User updatedUser);
    void deleteUser(String userId);
}
