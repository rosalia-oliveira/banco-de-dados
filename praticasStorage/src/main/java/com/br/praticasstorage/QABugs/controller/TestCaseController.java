package com.br.praticasstorage.QABugs.controller;

import com.br.praticasstorage.QABugs.model.TestCase;
import com.br.praticasstorage.QABugs.service.interfaces.ITestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/testcases")
public class TestCaseController {
    @Autowired
    private ITestCase service;

    @GetMapping()
    public ResponseEntity<List<TestCase>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping(params = "last_update")
    public ResponseEntity<List<TestCase>> getLastUpdate(@RequestParam Date last_update) {
        return ResponseEntity.ok(service.getLastUpdate(last_update));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<TestCase> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping("/new")
    public ResponseEntity<TestCase> create(@RequestBody TestCase newTestCase) {
        return new ResponseEntity<>(service.create(newTestCase), HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<TestCase> update(@RequestBody TestCase updated) {
        return ResponseEntity.ok(service.update(updated));
    }

    @DeleteMapping("/deleteId/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
        ResponseEntity.noContent().build();
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        service.deleteAll();
        ResponseEntity.noContent().build();
    }

}
