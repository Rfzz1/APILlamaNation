package com.example.llamanation.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.llamanation.database.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByNickname(String nickname);
}