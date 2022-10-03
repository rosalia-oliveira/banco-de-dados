package com.bootcamp.pratica1javaiii.controller;

import com.bootcamp.pratica1javaiii.model.Symptoms;
import com.bootcamp.pratica1javaiii.service.SymptomsService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/findSymptom")
public class SymptomsController {
    @Autowired
    private SymptomsService service;

    @GetMapping("/{name}")
    public ResponseEntity<Symptoms> getSymptomByName(@PathVariable String name) {
        Symptoms symptom = service.getSymptomByName(name);

        return new ResponseEntity<Symptoms>(symptom, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Symptoms>> getAllSymptoms() {
        return new ResponseEntity<>(service.getAllSymptoms(), HttpStatus.OK);
    }

}
