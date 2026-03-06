package ru.zickzibn.springboot.service;


import ru.zickzibn.springboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);

    void deleteById(Long id);

    User findUserById(Long id);
}
