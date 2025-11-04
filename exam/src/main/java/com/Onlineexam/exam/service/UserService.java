package com.Onlineexam.exam.service;

import com.Onlineexam.exam.model.User;
import com.Onlineexam.exam.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User addUser(User user) { return repo.save(user); }
    public List<User> getAllUsers() { return repo.findAll(); }
}
