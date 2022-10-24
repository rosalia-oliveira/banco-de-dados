package com.crud.storage.controller;

import com.crud.storage.model.SystemUser;
import com.crud.storage.service.SystemUserServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/bd")
public class SystemUserController {

    @Autowired
    private SystemUserServiceService userService;

    @GetMapping("/user")
    public ResponseEntity<List<SystemUser>> getAll () {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<?> create (@RequestBody SystemUser newUser) throws KeyAlreadyExistsException {
        SystemUser user;
        try {
            user = userService.create(newUser);
        } catch (KeyAlreadyExistsException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping("/user")
    public ResponseEntity<Object> update (@RequestBody SystemUser updated) throws NoSuchElementException {
        SystemUser userUpdated;
        try {
            userUpdated = userService.update(updated);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userUpdated, HttpStatus.CREATED);
    }

}
