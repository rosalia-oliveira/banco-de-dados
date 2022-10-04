package com.bootcamp.pratica1javaiii.controller;

import com.bootcamp.pratica1javaiii.dto.PersonDTO;
import com.bootcamp.pratica1javaiii.model.Person;
import com.bootcamp.pratica1javaiii.model.Symptom;
import com.bootcamp.pratica1javaiii.service.PersonService;
import com.bootcamp.pratica1javaiii.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("findRiskPerson")
public class PersonController {

    @Autowired
    private PersonService personServ;

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAllPersons() {
        return new ResponseEntity<>(personServ.getAllPersons(), HttpStatus.OK);
    }

    @GetMapping("/{age}")
    public ResponseEntity<List<Person>> getPersonByAge(@PathVariable int age) {
        List<Person> personByAge = personServ.getPersonByAge(age);
        return new ResponseEntity<>(personByAge, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<PersonDTO>> getPersonRiskAndSymptoms() {
        List<Person> risk = personServ.getRiskPerson();
        List<PersonDTO> listRiskPerson = risk.stream()
                .map(person -> new PersonDTO(person)).collect(Collectors.toList());
        return new ResponseEntity<>(listRiskPerson, HttpStatus.OK);
    }

}
