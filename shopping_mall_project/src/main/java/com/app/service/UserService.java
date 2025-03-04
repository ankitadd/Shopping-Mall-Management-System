package com.app.service;

import java.util.List;

import com.app.entity.User;

public interface UserService {
    
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    void deleteById(Long id);
}
