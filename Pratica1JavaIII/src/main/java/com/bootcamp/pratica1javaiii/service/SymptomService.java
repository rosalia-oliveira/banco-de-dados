package com.bootcamp.pratica1javaiii.service;

import com.bootcamp.pratica1javaiii.model.Symptom;
import com.bootcamp.pratica1javaiii.repository.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SymptomService implements ISymptom {

    @Autowired
    private SymptomRepository repository;

    @Override
    public Symptom getSymptomByName(String name) {
        return repository.getSymptomsByName(name);
    }

    @Override
    public List<Symptom> getAllSymptoms() {
        return repository.getAllSymptoms();
    }
}
