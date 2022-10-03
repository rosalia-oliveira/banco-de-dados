package com.bootcamp.pratica1javaiii.repository;

import com.bootcamp.pratica1javaiii.model.Symptoms;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Repository
public class SymptomsRepository {
    private final String repository = "src/main/resources/symptoms.json";
    ObjectMapper mapper = new ObjectMapper();

    public List<Symptoms> getAllSymptoms() {
        List<Symptoms> listSymptoms = null;
        try {
            listSymptoms = Arrays.asList(mapper.readValue(new File(repository), Symptoms[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listSymptoms;
    }

    public Symptoms getSymptomsByName(String name) {
        List<Symptoms> listSymptoms = null;
        try {
            listSymptoms = Arrays.asList(mapper.readValue(new File(repository), Symptoms[].class));
        } catch (Exception exc) {
            return null;
        }
        return listSymptoms.stream()
                .filter(symptom -> symptom.getName().equalsIgnoreCase(name))
                .findFirst().get();
    }

}
