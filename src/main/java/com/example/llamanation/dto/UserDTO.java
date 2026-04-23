package com.example.llamanation.dto;

public class UserDTO {

    private String nickname;
    private String email;
    private String password;

    public String getNickname() { return nickname; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    public void setNickname(String nickname) { this.nickname = nickname; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
}