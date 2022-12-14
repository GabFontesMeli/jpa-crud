package com.example.storage01.controller;

import com.example.storage01.model.UserBD;
import com.example.storage01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserBD> insert(@RequestBody UserBD user) {
        return new ResponseEntity<>(service.insert(user), HttpStatus.CREATED);
    }

    @GetMapping("/{cod}")
    public ResponseEntity<UserBD> findById(@PathVariable long cod) {
        Optional<UserBD> optionalUserBD = service.findById(cod);

        if (optionalUserBD.isPresent()) {
            return new ResponseEntity<>(optionalUserBD.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping
    public ResponseEntity<UserBD> update(@RequestBody UserBD user) {
        return new ResponseEntity<>(service.update(user), HttpStatus.OK);
    }

    @DeleteMapping("/{cod}")
    public ResponseEntity<Void> delete(@PathVariable long cod) {
        service.delete(cod);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
