package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(Long id);
    void save(User user);
    void update(Long id, User updatedUser);
    void delete(Long id);

    User getUserByUsername(String username);

    void addRoleToUser(User user, Role role);

}
