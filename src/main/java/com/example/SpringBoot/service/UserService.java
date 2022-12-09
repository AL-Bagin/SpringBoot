package com.example.SpringBoot.service;


import com.example.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> index();
    void save(User user);
    User show(int id);

    void update(int id, User user);

    void delete(int id);
}
