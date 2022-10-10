package com.testes.testes.controller;

import com.testes.testes.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping()
    public ResponseEntity<UserDTO> create(@Valid @RequestBody UserDTO newUser) {
        return ResponseEntity.ok(newUser);
    }

}
