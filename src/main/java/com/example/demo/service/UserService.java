package com.example.demo.service;

import com.example.demo.model.User;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for User business logic.
 */
public interface UserService {
    List<User> findAll();
    Optional<User> findById(Long id);
    User save(User user);
    void deleteById(Long id);
    boolean existsById(Long id);
}