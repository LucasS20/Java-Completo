package com.educandoWeb.course.model.services;

import com.educandoWeb.course.model.entities.User;
import com.educandoWeb.course.model.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repo.findById(id);
        return obj.get();
    }
}
