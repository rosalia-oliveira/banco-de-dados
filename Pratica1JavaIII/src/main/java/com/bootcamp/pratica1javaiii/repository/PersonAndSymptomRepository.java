package com.bootcamp.pratica1javaiii.repository;

import com.bootcamp.pratica1javaiii.model.PersonAndSymptom;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


@Repository
public class PersonAndSymptomRepository {
    private final String riskPersonRepo = "src/main/resources/personAndSymptoms.json";
    ObjectMapper mapper = new ObjectMapper();

    public List<PersonAndSymptom> getAllPersonAndSymptom() {
        List<PersonAndSymptom> listPerson;
        try {
            listPerson = Arrays.asList(mapper.readValue(new File(riskPersonRepo), PersonAndSymptom[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listPerson;
    }
}
