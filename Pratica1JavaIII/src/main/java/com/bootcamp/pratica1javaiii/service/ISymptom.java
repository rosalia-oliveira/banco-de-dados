package com.bootcamp.pratica1javaiii.service;

import com.bootcamp.pratica1javaiii.model.Symptoms;

import java.util.List;

public interface ISymptom {
    List<Symptoms> getAllSymptoms();
    Object getSymptomByName(String name);
}
