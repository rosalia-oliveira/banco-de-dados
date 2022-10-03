package com.bootcamp.pratica1javaiii.service;

import com.bootcamp.pratica1javaiii.model.Symptom;

import java.util.List;

public interface ISymptom {
    List<Symptom> getAllSymptoms();
    Object getSymptomByName(String name);
}
