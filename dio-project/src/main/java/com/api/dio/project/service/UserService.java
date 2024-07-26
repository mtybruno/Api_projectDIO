package com.api.dio.project.service;

import com.api.dio.project.model.User;
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}