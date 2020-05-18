package io.realworld.app.utils;

import io.realworld.app.model.User;

import java.util.Random;

public class UserData {

    public static User defaultUser() {
        return new User("198219821982");
    }

    public static User randomUser() {
        User user = new User();
        String username = "testuser" + new Random().nextInt(10000);
        String email = username + "@gmail.com";
        String password = "qwerty123";
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }
}
