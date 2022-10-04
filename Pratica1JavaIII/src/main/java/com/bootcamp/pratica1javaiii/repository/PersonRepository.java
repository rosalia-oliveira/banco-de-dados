package com.bootcamp.pratica1javaiii.repository;

import com.bootcamp.pratica1javaiii.model.Person;
import com.bootcamp.pratica1javaiii.model.PersonAndSymptom;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonRepository {
    private final String personRepo = "src/main/resources/persons.json";
    private final PersonAndSymptomRepository PAndSRepo = new PersonAndSymptomRepository();
    ObjectMapper mapper = new ObjectMapper();

    public List<Person> getAllPersons() {
        List<Person> listPersons;
        try {
            listPersons = Arrays.asList(mapper.readValue(new File(personRepo), Person[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return listPersons;
    }

    public List<Person> getPersonByAge(int age) {
        List<Person> listPerson = getAllPersons();
        return listPerson.stream()
                .filter(person -> person.getAge() >= age)
                .collect(Collectors.toList());
    }

    public List<Person> getRiskPerson() {
        List<PersonAndSymptom> pSRepo = PAndSRepo.getAllPersonAndSymptom();
        List<Person> persons = getPersonByAge(60).stream()
                .filter(person -> pSRepo.stream().anyMatch( ps -> ps.getPersonId() == person.getId() && !ps.getSymptoms().isEmpty())
                ).collect(Collectors.toList());
        return persons;
    }

}
