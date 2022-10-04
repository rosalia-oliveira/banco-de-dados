package com.bootcamp.aulaspringlayers.controller;

import com.bootcamp.aulaspringlayers.model.Owner;
import com.bootcamp.aulaspringlayers.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService service;

    @GetMapping
    public ResponseEntity<List<Owner>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
