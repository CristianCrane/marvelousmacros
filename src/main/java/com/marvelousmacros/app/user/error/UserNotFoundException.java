package com.marvelousmacros.app.user.error;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String userId) {
        super(String.format("No user with ID=%s found", userId));
    }
}
