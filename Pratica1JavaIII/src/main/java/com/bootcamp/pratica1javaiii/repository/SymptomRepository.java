package com.bootcamp.pratica1javaiii.repository;

import com.bootcamp.pratica1javaiii.model.Symptom;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Repository
public class SymptomRepository {
    private final String symptomRepo = "src/main/resources/symptoms.json";
    ObjectMapper mapper = new ObjectMapper();

    public List<Symptom> getAllSymptoms() {
        List<Symptom> listSymptoms;
        try {
            listSymptoms = Arrays.asList(mapper.readValue(new File(symptomRepo), Symptom[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listSymptoms;
    }

    public Symptom getSymptomsByName(String name) {
        List<Symptom> listSymptoms = getAllSymptoms();
        return listSymptoms.stream()
                .filter(symptom -> symptom.getName().equalsIgnoreCase(name))
                .findFirst().get();
    }

}
