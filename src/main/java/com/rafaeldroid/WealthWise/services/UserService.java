package com.rafaeldroid.WealthWise.services;

import com.rafaeldroid.WealthWise.models.User;
import com.rafaeldroid.WealthWise.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }
}
