package com.example.storage01.service;

import com.example.storage01.model.UserBD;

import java.util.Optional;

public interface IUserService {
    UserBD insert(UserBD user);
    Optional<UserBD> findById(long cod);
    UserBD update(UserBD user);

    void delete(long cod);
}
