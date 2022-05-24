package com.self.crud.services;

import java.util.List;
import java.util.Optional;

import com.self.crud.entities.User;
import com.self.crud.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(int id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }

}
