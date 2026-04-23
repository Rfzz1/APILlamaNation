package com.example.llamanation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

import com.example.llamanation.database.model.User;
import com.example.llamanation.database.repository.UserRepository;
import com.example.llamanation.dto.UserDTO;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User cadastrar(UserDTO dto) {

        User user = new User();

        user.setNickname(dto.getNickname());
        user.setEmail(dto.getEmail());

        // ⚠️ depois vamos criptografar isso
        user.setPasswordHash(dto.getPassword());

        user.setLevel(1);
        user.setCreatedAt(OffsetDateTime.now());

        return repository.save(user);
    }
}