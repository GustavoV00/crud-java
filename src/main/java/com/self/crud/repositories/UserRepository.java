package com.self.crud.repositories;

import java.util.Optional;

import com.self.crud.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}