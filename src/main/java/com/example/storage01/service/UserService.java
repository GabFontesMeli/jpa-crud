package com.example.storage01.service;

import com.example.storage01.model.UserBD;
import com.example.storage01.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserBD insert(UserBD user) {
        return repo.save(user);
    }

    @Override
    public Optional<UserBD> findById(long cod) {
         return repo.findById(cod);
    }

    public UserBD update(UserBD user) {
        return repo.save(user);
    }

    @Override
    public void delete(long cod) {
        repo.deleteById(cod);
    }

}
