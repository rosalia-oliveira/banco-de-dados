package com.crud.storage.controller;

import com.crud.storage.model.SystemUser;
import com.crud.storage.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/bd")
public class SystemUserController {

    @Autowired
    private SystemUserService userService;

    @PostMapping("/user")
    public ResponseEntity<SystemUser> create (@RequestBody SystemUser newUser) {
        return new ResponseEntity<>(userService.create(newUser), HttpStatus.CREATED);
    }

    @PutMapping("/user")
    public ResponseEntity<SystemUser> update (@RequestBody SystemUser updated) {
        SystemUser userUpdated;
        try {
            userUpdated = userService.update(updated);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userUpdated, HttpStatus.CREATED);
    }

}
