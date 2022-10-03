package com.bootcamp.pratica1javaiii.controller;

import com.bootcamp.pratica1javaiii.model.Symptom;
import com.bootcamp.pratica1javaiii.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/findSymptom")
public class SymptomController {
    @Autowired
    private SymptomService service;

    @GetMapping("/{name}")
    public ResponseEntity<Symptom> getSymptomByName(@PathVariable String name) {
        Symptom symptom = service.getSymptomByName(name);

        return new ResponseEntity<Symptom>(symptom, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Symptom>> getAllSymptoms() {
        return new ResponseEntity<>(service.getAllSymptoms(), HttpStatus.OK);
    }

}
