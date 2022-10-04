package com.bootcamp.pratica1javaiii.service;

import com.bootcamp.pratica1javaiii.model.PersonAndSymptom;
import com.bootcamp.pratica1javaiii.repository.PersonAndSymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonAndSymptomService implements IPersonAndSymptom{
    @Autowired
    private PersonAndSymptomRepository repository;

    @Override
    public List<PersonAndSymptom> getAllPersonAndSymptom() {
        return repository.getAllPersonAndSymptom();
    }
}
