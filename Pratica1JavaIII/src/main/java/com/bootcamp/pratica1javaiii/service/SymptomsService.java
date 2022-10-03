package com.bootcamp.pratica1javaiii.service;

import com.bootcamp.pratica1javaiii.controller.SymptomsController;
import com.bootcamp.pratica1javaiii.model.Symptoms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SymptomsService implements ISymptom {

    @Autowired
    private SymptomsController repository;

    @Override
    public Object getAllSymptoms() {
        List<Symptoms> allSymptoms = repository.getAllSymptoms();
        if(allSymptoms == null) {
            return "Not Found";
        }
        return allSymptoms;
    }

    @Override
    public Symptoms getSymptomByName(String name) {
        Symptoms symptomByName = repository.getSymptomByName(name);
        if(symptomByName == null) {
            return "Not Found";
        }
        return symptomByName;
    }
}
