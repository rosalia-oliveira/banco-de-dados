package com.bootcamp.pratica1javaiii.service;

import com.bootcamp.pratica1javaiii.model.Person;

import java.util.List;

public interface IPerson {
    List<Person> getAllPersons();
    List<Person> getPersonByAge(int age);
    List<Person> getRiskPerson();
}
