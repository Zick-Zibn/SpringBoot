package ru.zickzibn.springboot.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zickzibn.springboot.entity.User;
import ru.zickzibn.springboot.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Override
    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }
    @Override
    @Transactional
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
