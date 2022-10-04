package com.bootcamp.pratica1javaiii.service;

import com.bootcamp.pratica1javaiii.model.Person;
import com.bootcamp.pratica1javaiii.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPerson {

    @Autowired
    private PersonRepository repository;

    @Override
    public List<Person> getAllPersons() {
        return repository.getAllPersons();
    }

    @Override
    public List<Person> getPersonByAge(int age) {
        return repository.getPersonByAge(age);
    }

    @Override
    public List<Person> getRiskPerson() {
        return repository.getRiskPerson();
    }

}
