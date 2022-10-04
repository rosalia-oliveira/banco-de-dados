package com.bootcamp.pratica1javaiii.dto;

import com.bootcamp.pratica1javaiii.model.Person;
import lombok.Data;

import java.util.List;

@Data
public class PersonDTO {
    private String name;
    private String lastName;

    public PersonDTO(List<Person> person) {
        person.stream().forEach(p -> {
            this.name = p.getName() ;
            this.lastName = p.getLastName();
        });
    }
}
