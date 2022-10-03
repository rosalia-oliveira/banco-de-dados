package com.bootcamp.pratica1javaiii.service;

import com.bootcamp.pratica1javaiii.model.Symptoms;
import com.bootcamp.pratica1javaiii.repository.SymptomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SymptomsService implements ISymptom {

    @Autowired
    private SymptomsRepository repository;

    @Override
    public Symptoms getSymptomByName(String name) {
        Symptoms symptomByName = repository.getSymptomsByName(name);
        return symptomByName;
    }

    @Override
    public List<Symptoms> getAllSymptoms() {
        return repository.getAllSymptoms();
    }
}
