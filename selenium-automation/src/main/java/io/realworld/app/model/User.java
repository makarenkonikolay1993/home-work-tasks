package io.realworld.app.model;

public class User {
    protected String username;
    protected String email;
    protected String password="qwerty123";

    public User() {

    }

    public User(String username) {
        this.username = username;
        this.email = username+"@gmail.com";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
