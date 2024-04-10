package com.rafaeldroid.WealthWise.services;

import com.rafaeldroid.WealthWise.models.User;
import com.rafaeldroid.WealthWise.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        Optional<User> existingUser = userRepository.findById(id);

        if(existingUser.isPresent())
            return existingUser;
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found transaction");
    }
}
